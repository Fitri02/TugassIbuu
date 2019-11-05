/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasibudyah;
import java.util.Scanner;
public class TugasIbuDyah {
    public static void main(String[] args) {
    int nilai[] []= new int[] []{
        {2,  4,   6,   8},
        {3,  9,   27,  30},
        {4,  16,  20,  24},
        {15, 25,  35,  45}};
    
    int b, k;
    System.out.println("-------------------------------");
    for(b=0;b<4; b++){
       for(k = 0;k<4; k++){
           System.out.print(nilai[b][k]+ "   ");
       } 
       
       System.out.println("");
    }
    System.out.println("-------------------------------");
    }
    
}
