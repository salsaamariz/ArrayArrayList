/*
 * Nama: [Isi Nama Anda di Sini]
 * NPM: [Isi NPM Anda di Sini]
 */
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Poin 4: Menyimpan daftar nama mata kuliah dalam array String ukuran tetap (min 3) dan menampilkannya [cite: 277]
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Poin 3: Membuat objek KelasKuliah [cite: 276]
        KelasKuliah kelas = new KelasKuliah();

        // Menambah minimal 5 objek Mahasiswa awal ke dalam koleksi [cite: 276]
        kelas.tambahMahasiswa(new Mahasiswa("Andi Wijaya", "230101001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "230101002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Lestari", "230101003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi Kurniawan", "230101004", 42.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri", "230101005", 78.0));

        // Menampilkan semua data mahasiswa awal 
        kelas.tampilkanSemua();

        // Poin 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus [cite: 278]
        System.out.println("=== ANALISIS NILAI AWAL ===");
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println("Total Data Mahasiswa  : " + kelas.getJumlahData());
        System.out.println();

        // Poin 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi [cite: 278]
        System.out.println(">> Menambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Pratama", "230101006", 88.0));

        // Menampilkan kembali data setelah penambahan beserta jumlah data terbaru [cite: 278]
        kelas.tampilkanSemua();
        System.out.println("=== UPDATE DATA ===");
        System.out.println("Total Data Mahasiswa Terbaru: " + kelas.getJumlahData());
        System.out.printf("Rata-rata Nilai Terbaru     : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus Baru : " + kelas.jumlahLulus());
    }
}