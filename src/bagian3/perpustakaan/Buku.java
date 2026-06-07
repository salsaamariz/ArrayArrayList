package bagian3.perpustakaan;

public class Buku {
    // Atribut lama [cite: 180]
    private String judul;
    private String penulis;
    private boolean dipinjam;
    // LATIHAN NO 2: Tambah atribut tahunTerbit 
    private int tahunTerbit;

    // LATIHAN NO 2: Update constructor agar menerima tahunTerbit 
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // [cite: 180]
    }

    // Getter lama [cite: 180, 181]
    public String getJudul() {
        return judul; // [cite: 183]
    }

    public String getPenulis() {
        return penulis; // [cite: 186]
    }

    public boolean isDipinjam() {
        return dipinjam; // [cite: 188]
    }

    // LATIHAN NO 2: Tambah getter untuk tahunTerbit 
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam; // [cite: 193]
    }

    // LATIHAN NO 2: Update info() untuk menampilkan tahun terbit 
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia"; // [cite: 197]
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]"; // [cite: 198]
    }
}