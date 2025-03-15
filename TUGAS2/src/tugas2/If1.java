/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author nuraq
 */
/* contoh pemakaian IF satu kasus */ 
/* membaca nilai integer, menuliskan nilainya jika positif */  

import java.util.Scanner;

public class If1 {
  
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus */  
        Scanner masukan=new Scanner(System.in); 
        int a; 
        /* Program */ 

        System.out.print ("Contoh IF satu kasus \n");  
        System.out.print ("Ketikkan suatu nilai integer : ");  
        a = masukan.nextInt(); 
        if (a >= 0)  
        System.out.println  ("\nNilai a positif "+ a);  
    } 
}