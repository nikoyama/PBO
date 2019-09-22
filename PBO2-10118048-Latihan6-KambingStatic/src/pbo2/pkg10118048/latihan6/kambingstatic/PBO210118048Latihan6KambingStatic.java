/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan6.kambingstatic;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program ini berisi cara pengaksesan variable
 * melalui variable kelas/static
 */
public class PBO210118048Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
    
}
