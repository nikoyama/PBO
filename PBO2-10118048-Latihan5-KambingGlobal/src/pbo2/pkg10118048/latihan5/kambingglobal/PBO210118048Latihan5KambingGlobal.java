/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan5.kambingglobal;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program ini berisi cara pengaksesan variable
 * melalui variable instance
 */
public class PBO210118048Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // Variable jumlahKambing menjadi variable instance
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void  tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118048Latihan5KambingGlobal kambingSusu = new PBO210118048Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
