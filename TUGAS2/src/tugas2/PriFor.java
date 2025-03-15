/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author nuraq
 */
import java.util.Scanner; 
 
/* Baca N, Print 1 s/d N dengan FOR */  
public class PriFor { 
 
    /** 
     * @param args 
     */ 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus */  
        int i,N;  
        Scanner masukan=new Scanner(System.in); 
        /* Program */ 
        /* program */ 

        System.out.print ("Baca N, print 1 s/d N ");  
        System.out.print ("N = "); 

        N=masukan.nextInt(); 

        for (i = 1; i <= N; i++){ 
        System.out.println (i); }; 
        System.out.println ("Akhir program \n");  
    } 
} 