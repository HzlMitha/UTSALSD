public class MataKuliah {
    String kodeMk;
    String namaMK;
    int sks;

    public MataKuliah () {

    }

    public MataKuliah (String kdMatkul, String nmMatkul, int sks) {
        kodeMk = kdMatkul;
        namaMK = nmMatkul;
        this.sks = sks;
    }

    void tampilMataKuliah () {
        System.out.printf("%-15s | %-20s | %-10s%n", "KodeMK: " + kodeMk, "Nama: " + namaMK, "SKS: " + sks);           
    }
}
