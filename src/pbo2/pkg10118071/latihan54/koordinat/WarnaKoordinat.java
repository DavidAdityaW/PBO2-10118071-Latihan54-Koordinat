/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan54.koordinat;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menetukkan
 *                     titik koordinat
 * 
 */
public class WarnaKoordinat extends Koordinat {
    private String namaWarna;
    
    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
        this.namaWarna = namaWarna;
    }
    
    public String getNamaWarna() {
        return namaWarna;
    }
    
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
}
