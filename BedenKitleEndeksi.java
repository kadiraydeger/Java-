/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beden.kitle.endeksi;

import java.util.Scanner;



/**
 *
 * @author kadir
 */
public class BedenKitleEndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
       // System.out.println("Vücut Kitle İndeksi Hesaplama Programı");
     //   int yas = scanner.nextInt();
        System.out.print("Kilonuzu Giriniz : ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu Giriniz : (Örnek=1.75): ");
        double boy = scanner.nextDouble();
        
        double vki = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vki);
        
        
       
    }
    
}
