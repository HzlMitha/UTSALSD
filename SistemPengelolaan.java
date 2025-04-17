import java.util.Scanner;

public class SistemPengelolaan {
    public static void main(String[] args) {
        Scanner sc06 = new Scanner(System.in);
        Sistem sistem = new Sistem();

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
                    sistem.tampilkanDaftarMahasiswa();
                    break;

                case 2:
                    sistem.tampilkanDaftarMataKuliah();
                    break;

                case 3:
                    sistem.tampilkanDataPenilaian();
                    break;

                case 4:
                    sistem.urutkanMahasiswaBerdasarkanNilaiAkhir();
                    break;

                case 5:
                    sistem.urutkanMahasiswaBerdasarkanNIM();
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nimDicari = sc06.nextLine();
                    sistem.cariMahasiswaBerdasarkanNIM(nimDicari);
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
