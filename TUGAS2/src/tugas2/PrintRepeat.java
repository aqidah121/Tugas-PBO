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
 
 
public class PrintRepeat { 
 
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
            // TODO Auto-generated method stub 
            /* Kamus : */ 
            int N; 
            int i; 
            Scanner masukan=new Scanner(System.in); 
            /* Program */ 

            System.out.print  ("Nilai N >0 = ");  
            /* Inisialisasi */  
            N = masukan.nextInt(); 

            i = 1;  
            /* First Elmt */ 
            System.out.print ("Print i dengan REPEAT: \n");  
            do{ 
               System.out.print (i+"\n"); /* Proses */  
               i++;  /* Next Elmt */ 
            } 

            while (i <= N); /* Kondisi pengulangan */  
 } 
 
}