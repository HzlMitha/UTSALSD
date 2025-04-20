public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah () {
        System.out.printf("%-15s | %-25s | %-10s%n", "Kode MK: " + kodeMK, "Nama MK: " + namaMK, "SKS: " + sks);
    }
}
