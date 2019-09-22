/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118048.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA     : Niko Yama
 * KELAS    : PBO2
 * NIM      : 10118048
 * Deskripsi Program : Program ini berisi cara menginput nilai
 * (text) dari keyboard  
 */
public class PBO210118048Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
