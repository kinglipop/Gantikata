/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan28.gantikata;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi program untuk mengganti suatu kata
 */
public class PBO11K10118904Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, ganti, jadi, revisi;
        Scanner input = new Scanner(System.in);
        System.out.println("====== Program mengganti kata ======");
        System.out.println("");
        System.out.print("Masukan kalimat : ");
        kalimat = input.nextLine();
        System.out.print("Ganti kata : ");
        ganti = input.nextLine();
        System.out.print("Menjadi kata : ");
        jadi = input.next();
        revisi = kalimat.replaceAll(ganti,jadi);
        System.out.println("====== Hasil formatting ======");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + revisi);
        
    }
    
}
