/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class poke {
    
    public static void main(String[] args) {
           Scanner leia = new Scanner(System.in);
     int x_j =0; 
           int y_j = 0;
           int x_p = 0;
           int y_p = 0 ;
           
         System.out.println(" Digite o valor de x_p : ");
        x_p  = leia.nextInt();
         System.out.println(" Digite o valor de Y_p");
        y_p  = leia.nextInt();
        
       while(x_j != x_p && y_j != y_p){
           int temp = x_p - x_j;
          if ( temp > 0 ){
              x_j++;
             
          } 
          else if( temp < 0)
              x_j--;
              
           System.out.println(x_j);
           
           temp = y_p - y_j;
            if ( temp > 0 ){
              y_j++;
             
          } 
          else if( temp < 0)
              y_j--;
              
           System.out.println(y_j);
           
     }      
  }
} 
