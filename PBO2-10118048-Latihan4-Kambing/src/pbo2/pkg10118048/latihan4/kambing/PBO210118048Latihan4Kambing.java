/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan4.kambing;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program  ini berisi cara pengaksesan 
 * variable melalui variable lokal
 */
public class PBO210118048Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing() {
        //Deklarasi variable lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210118048Latihan4Kambing kambingJantan  = new PBO210118048Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
