package bagian3.perpustakaan;

import java.util.ArrayList; // [cite: 205]

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>(); // [cite: 208]

    public void tambahBuku(Buku buku) {
        koleksi.add(buku); // [cite: 212]
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan =="); // [cite: 214]
        for (int i = 0; i < koleksi.size(); i++) { // [cite: 218]
            Buku b = koleksi.get(i); // [cite: 220]
            System.out.println((i + 1) + ". " + b.info()); // [cite: 221]
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) { // [cite: 224]
            if (b.getJudul().equals(judul)) { // [cite: 225]
                if (b.isDipinjam()) { // [cite: 226]
                    System.out.println(judul + " sedang dipinjam."); // [cite: 227]
                } else {
                    b.setDipinjam(true); // [cite: 229]
                    System.out.println(judul + " berhasil dipinjam."); // [cite: 230]
                }
                return; // [cite: 231]
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan."); // [cite: 236]
    }

    public int jumlahTersedia() {
        int jumlah = 0; // [cite: 239]
        for (Buku b : koleksi) { // [cite: 240]
            if (!b.isDipinjam()) { // [cite: 241]
                jumlah++; // [cite: 242]
            }
        }
        return jumlah; // [cite: 245]
    }

    // LATIHAN NO 1: Method untuk mengembalikan buku [cite: 323]
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) { // [cite: 323]
            if (b.getJudul().equals(judul)) { // [cite: 323]
                b.setDipinjam(false); // [cite: 323]
                System.out.println(judul + " telah dikembalikan."); // [cite: 324]
                return; // [cite: 324]
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan."); // [cite: 324]
    }

    // LATIHAN NO 3: Method untuk mencari buku berdasarkan penulis [cite: 269]
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Cari Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku karya " + penulis + " di perpustakaan.");
        }
    }
}