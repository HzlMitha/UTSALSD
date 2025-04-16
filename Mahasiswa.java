public class Mahasiswa {
    String nim;
    String nama;
    String prodi; 
    
    public Mahasiswa () {
    
    }
    
    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
    
    void tampilMahasiswa() {
        for (int i = 0; i < 5; i++) {
            System.out.println("-------------------------------------");
            System.out.println("NIM/t : " + nim);
            System.out.println("Nama/t : " + nama);
            System.out.println("Prodi/t : " + prodi);
        }
    }
}    


