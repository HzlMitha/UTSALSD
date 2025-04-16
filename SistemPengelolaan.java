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
            new Penilaian(listMhs[1], listMk[1], 60, 75, 70),
            new Penilaian(listMhs[0], listMk[0], 75, 70, 80),
            new Penilaian(listMhs[1], listMk[1], 85, 90, 95),
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
            System.out.println("Pilih menu : ");
            pilihan = sc06.nextInt();
            sc06.nextLine();

            switch (pilihan) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Pilihan menu tidak ada");
                    break;
            }
        } while (pilihan != 0);
        
    }
}
