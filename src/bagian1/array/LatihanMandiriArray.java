/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author Asus V16
 */
public class LatihanMandiriArray {
    public static void main(String[] args) {
        // 1. MENCARI SUHU TERTINGGI DAN TERENDAH
        System.out.println("=== NO 1: ANALISIS SUHU ===");
        double[] suhu = {31.5, 34.2, 29.8, 35.0, 30.5, 32.1}; // 6 suhu harian
        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }
        System.out.println("Suhu tertinggi : " + tertinggi + "C");
        System.out.println("Suhu terendah  : " + terendah + "C");
        System.out.println(); 
        
        // 2. MEMFILTER NAMA HARI (> 5 HURUF)
        System.out.println("=== NO 2: FILTER NAMA HARI (> 5 HURUF) ===");
        // Berisi nama hari 
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"}; 

        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        for (int i = 0; i < hari.length; i++) {
            if (hari[i].length() > 5) {
                System.out.println("- " + hari[i]);
            }
        }
        System.out.println(); 
        
        // 3. MENGHITUNG BANYAK ANGKA GENAP
        System.out.println("=== NO 3: HITUNG ANGKA GENAP ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int banyakGenap = 0;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                banyakGenap++;
            }
        }
        System.out.println("Banyak angka genap di dalam array: " + banyakGenap);
    }
}
