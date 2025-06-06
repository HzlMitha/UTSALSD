public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian (Mahasiswa mhs, MataKuliah mk, double tugas, double uts, double uas) {
        mahasiswa = mhs;
        mataKuliah = mk;
        nilaiTugas = tugas;
        nilaiUTS = uts;
        nilaiUAS = uas;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilkanDataPenilaian () {
        System.out.printf("%-15s | %-20s | %-10s%n", mahasiswa.nama, mataKuliah.namaMK, "Nilai Akhir: " + nilaiAkhir);
    }
}
