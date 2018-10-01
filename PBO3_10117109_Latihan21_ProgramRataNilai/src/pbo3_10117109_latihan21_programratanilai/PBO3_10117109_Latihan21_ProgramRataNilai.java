/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan21_programratanilai;

import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Membuat Program Rata-Rata
 */
public class PBO3_10117109_Latihan21_ProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
      int n;
      int jml;
      int nilai[];
      double rata;
      double jumlah = 0;
      
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        
        nilai = new int[n];
        
        for(int i=0; i<=n-1; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
                      
            
        }
      for(int j=0; j<=n-1; j++) {
          jumlah = jumlah + nilai[j];
          
      }
      
      rata = jumlah / n;
      
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya Adalah " + rata);
        
        System.out.println("Developedbby : Stefanus Saputra");
    }
    
}
