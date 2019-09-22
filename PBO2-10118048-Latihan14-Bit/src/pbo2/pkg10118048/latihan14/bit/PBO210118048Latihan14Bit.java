/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan14.bit;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program ini berisi penerapan
 * operator bit
 */
public class PBO210118048Latihan14Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        
        // operasi and
        c = a & b;
        /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);
        
        // operasi or
        c = a | b;
        /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);
        
        // operasi xor
        c = a ^ b;
        /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);
        
        // operasi not
        c = ~a;
        /* -61 = 1100 0011 */
        System.out.println("~a = " + c);
        
        // operasi shift left (geser bit ke kiri)
        c = a << 2;
        /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);
        
        // operasi shift right
        c = a >> 2;
        /* 15 = 0000 1111 */
        System.out.println("a >> 2 = " + c);
    }
    
}
