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
 
/* contoh pemakaian IF tiga kasus : wujud air */  
public class Tempair { 
 
    /** 
     * @param args 
     */ 
    public static void main(String[] args) { 
        // TODO Auto-generated method stub 
        /* Kamus : */  
        int T; 
        Scanner masukan=new Scanner(System.in); 
        /* Program */ 

        System.out.print  ("Contoh IF tiga kasus \n");  
        System.out.print  ("Temperatur (der. C) = ");  
        T = masukan.nextInt(); 
        if (T < 0) { 
            System.out.println ("Wujud air beku : "+ T ); 
        }else if ((0 <= T) && (T <= 100)){ 
            System.out.println ("Wujud air cair : "+ T); 
        }else if (T > 100){ 
            System.out.println ("Wujud air uap/gas : "+ T);  
        } 

       } 
} 
