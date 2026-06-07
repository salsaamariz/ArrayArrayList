package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan(); // [cite: 257]

        // LATIHAN NO 2: Pembuatan objek Buku disesuaikan dengan Constructor baru (tambah tahun) 
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005)); // [cite: 259]
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980)); // [cite: 260]
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009)); // [cite: 260]

        // 1. Tampilkan koleksi awal
        perpus.tampilkanKoleksi(); // [cite: 260]
        System.out.println();

        // 2. Uji coba pinjam buku
        perpus.pinjamBuku("Bumi Manusia"); // [cite: 260]
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia()); // [cite: 261]
        System.out.println();

        // 3. LATIHAN NO 1: Uji coba kembalikan buku 
        System.out.println(">> Menguji Fitur Pengembalian Buku:");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // 4. LATIHAN NO 3: Uji coba cari penulis [cite: 269]
        System.out.println(">> Menguji Fitur Cari Penulis:");
        perpus.cariPenulis("Andrea Hirata");
        perpus.cariPenulis("Tere Liye"); // Contoh jika tidak ditemukan
    }
}