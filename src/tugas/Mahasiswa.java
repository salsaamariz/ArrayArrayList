package tugas;

public class Mahasiswa {
    // Atribut model mahasiswa 
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk inisialisasi objek Mahasiswa 
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk mengakses nilai atribut dari luar class 
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method lulus() yang mengembalikan true jika nilai >= 60 
    public boolean lulus() {
        return nilai >= 60;
    }
}