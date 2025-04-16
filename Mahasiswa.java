public class Mahasiswa {
    String nim;
    String nama;
    String prodi;
    int listMhs = 3; 
    
    public Mahasiswa () {
    
    }
    
    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    void tampilMahasiswa() {
        System.out.printf("%-15s | %-20s | %-10s%n", "NIM: " + nim, "Nama: " + nama, "Prodi: " + prodi);           
    }
}    


