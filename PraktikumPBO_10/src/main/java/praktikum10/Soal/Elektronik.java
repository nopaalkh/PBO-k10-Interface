/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10.Soal;

/**
 *
 * @author ASUS
 */
// Kelas Elektronik yang mengimplementasikan interface Pembayaran
class Elektronik implements Pembayaran {
    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; // Pajak 10%
    }
}
