import java.util.Scanner;

public class SistemPengelolaan {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);

        Mahasiswa[] listMhs = {
            new Mahasiswa ("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa ("22002", "Budi Santoso", "Informatika"),
            new Mahasiswa ("22003", "Citra Dewi", "Sistem Informasi Bisnis")
        };

        MataKuliah[] listMk = {
            new MataKuliah ("MK001", "Struktur Data", 3),
            new MataKuliah ("MK002", "Basis Data", 3),
            new MataKuliah ( "MK003", "Desain web", 3)
        };

        Penilaian[] ObjPenilaian = {
            new Penilaian(listMhs[0], listMk[0], 80, 85, 90),
            new Penilaian(listMhs[0], listMk[1], 60, 75, 70),
            new Penilaian(listMhs[1], listMk[0], 75, 70, 80),
            new Penilaian(listMhs[2], listMk[1], 85, 90, 95),
            new Penilaian(listMhs[2], listMk[2], 80, 90, 65)
        };

        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc06.nextInt();
            sc06.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println();
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa Mhs : listMhs) {
                        Mhs.tampilMahasiswa();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Daftar Mata Kuliah:");
                    for (int i = 0; i < listMk.length; i++) {
                        listMk[i].tampilMataKuliah();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Data Penilaian:");
                    for (int i = 0; i < ObjPenilaian.length; i++) {
                        ObjPenilaian[i].tampilkanDataPenilaian();
                    }
                    System.out.println();
                    break;

                case 4:
                    for (int i = 0; i <= ObjPenilaian.length - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < ObjPenilaian.length; j++) {
                            if (ObjPenilaian[j].nilaiAkhir > ObjPenilaian[minIndex].nilaiAkhir) {
                                minIndex = j;
                            }
                        }
                        Penilaian temp = ObjPenilaian[minIndex];
                        ObjPenilaian[minIndex] = ObjPenilaian[i];
                        ObjPenilaian[i] = temp;
                    }
                    System.out.println();
                    System.out.println("Data Penilaian Berdasarkan Nilai Akhir: ");
                    for (Penilaian nilai : ObjPenilaian) {
                        System.out.printf("%-15s | %-20s | %-10s%n", nilai.mahasiswa.nama, nilai.mataKuliah.namaMK, "Nilai Akhir: " + nilai.nilaiAkhir);
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < listMhs.length - 1; i++) {
                        for (int j = 0; j < listMhs.length - i - 1; j++) {
                            if (listMhs[j].nim.compareTo(listMhs[j + 1].nim) > 0) {
                                Mahasiswa temp = listMhs[j];
                                listMhs[j] = listMhs[j + 1];
                                listMhs[j + 1] = temp;
                            }
                        }
                    }
                
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nimDicari = sc06.nextLine();
                
                    int left = 0, right = listMhs.length - 1, foundIndex = -1;
                    while (left <= right) {
                        int mid = (left + right) / 2;
                        if (listMhs[mid].nim.equals(nimDicari)) {
                            foundIndex = mid;
                            break;
                        } else if (listMhs[mid].nim.compareTo(nimDicari) < 0) {
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                
                    if (foundIndex != -1) {
                        Mahasiswa mhs = listMhs[foundIndex];
                        System.out.println("Mahasiswa Ditemukan: NIM: " + mhs.nim + " | Nama: " + mhs.nama + " | Prodi: " + mhs.prodi);
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimDicari + " tidak ditemukan.");
                    }
                    System.out.println();
                    break;

                case 0:
                System.out.println("Terima kasih telah menggunakan Sistem Pengelolaan Nilai Mahasiswa");
                    break;

                default:
                    System.out.println("Pilihan menu tidak ada");
                    break;
            }
        } while (pilihan != 0);

        sc06.close();
        
    }
}
