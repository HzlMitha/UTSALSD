public class Sistem {
    Mahasiswa[] listMhs = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    MataKuliah[] listMk = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3)
    };

    Penilaian[] ObjPenilaian = {
        new Penilaian(listMhs[0], listMk[0], 80, 85, 90),
        new Penilaian(listMhs[0], listMk[1], 60, 75, 70),
        new Penilaian(listMhs[1], listMk[0], 75, 70, 80),
        new Penilaian(listMhs[2], listMk[1], 85, 90, 95),
        new Penilaian(listMhs[2], listMk[2], 80, 90, 65)
    };

    public void tampilkanDaftarMahasiswa() {
        System.out.println();
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mhs : listMhs) {
            mhs.tampilMahasiswa();
        }
        System.out.println();
    }

    public void tampilkanDaftarMataKuliah() {
        System.out.println();
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : listMk) {
            mk.tampilMataKuliah();
        }
        System.out.println();
    }

    public void tampilkanDataPenilaian() {
        System.out.println();
        System.out.println("Data Penilaian:");
        for (Penilaian nilai : ObjPenilaian) {
            nilai.tampilkanDataPenilaian();
        }
        System.out.println();
    }

    public void urutkanMahasiswaBerdasarkanNilaiAkhir() {
        System.out.println();
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
        System.out.println("Data Penilaian Berdasarkan Nilai Akhir:");
        for (Penilaian nilai : ObjPenilaian) {
            System.out.printf("%-15s | %-20s | %-10s%n", nilai.mahasiswa.nama, nilai.mataKuliah.namaMK, "Nilai Akhir: " + nilai.nilaiAkhir);
        }
        System.out.println();
    }

    public void cariMahasiswaBerdasarkanNIM(String nimDicari) {
        System.out.println();
        int foundIndex = -1;

        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].nim.equals(nimDicari)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            Mahasiswa mhs = listMhs[foundIndex];
            System.out.println("Mahasiswa Ditemukan: NIM: " + mhs.nim + " | Nama: " + mhs.nama + " | Prodi: " + mhs.prodi);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimDicari + " tidak ditemukan.");
        }
        System.out.println();
    }
}
