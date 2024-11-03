/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10.Soal;

/**
 *
 * @author ASUS
 */
// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Elektronik dan Makanan
        Pembayaran produkElektronik = new Elektronik();
        Pembayaran produkMakanan = new Makanan();

        // Harga produk
        double hargaElektronik = 1000.00; // Contoh harga Elektronik
        double hargaMakanan = 200.00;      // Contoh harga Makanan

        // Menghitung pajak untuk masing-masing produk
        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);

        // Menampilkan hasil
        System.out.println("Pajak untuk Elektronik: " + pajakElektronik);
        System.out.println("Pajak untuk Makanan: " + pajakMakanan);
    }
}
