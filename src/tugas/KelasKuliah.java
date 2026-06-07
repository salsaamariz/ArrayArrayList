package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // ArrayList untuk menyimpan banyak objek bertipe Mahasiswa 
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method menambahkan mahasiswa ke dalam koleksi ArrayList 
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // Method menghitung nilai rata-rata dari seluruh mahasiswa 
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method menghitung total mahasiswa yang dinyatakan lulus 
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                count++;
            }
        }
        return count;
    }

    // Method untuk menampilkan semua data mahasiswa beserta status kelulusannya 
    public void tampilkanSemua() {
        System.out.println("=============================================");
        System.out.println("Daftar Mahasiswa di Kelas:");
        System.out.println("=============================================");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            String status = mhs.lulus() ? "Lulus" : "Tidak Lulus";
            System.out.println((i + 1) + ". " + mhs.getNama() + " (" + mhs.getNpm() + ") - Nilai: " + mhs.getNilai() + " [" + status + "]");
        }
        System.out.println("=============================================");
    }

    // Method tambahan untuk mempermudah pembacaan ukuran/jumlah data terbaru
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }
}