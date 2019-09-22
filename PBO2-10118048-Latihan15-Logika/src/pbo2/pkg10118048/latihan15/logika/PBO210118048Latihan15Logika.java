/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan15.logika;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program ini berisi penerapan
 * operator logika
 */
public class PBO210118048Latihan15Logika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b)); //logika AND
        System.out.println("a || b = " + (a || b)); //logika or
        System.out.println("!a = " + !a); //logika not
        System.out.println("!(a && b) = " + !(a && b));
    }
    
}
