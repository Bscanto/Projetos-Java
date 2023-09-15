package Aula11_Exercicios;

import java.util.Scanner;

/**
 ▪ Implemente uma função recursiva que imprime divisões sucessivas por 2 (atéa divisão ser
menor que 1)
▪ Exemplo: entrada = 54
Output: 27.0, 13.5, 6.75, 3.375, 1.6875
 */
public class Atividade3 {
     static void div(double n){
         
    System.out.println(n);
    if(n / 2 > 1){
      
        div(n/2);
    }
       
     }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
        System.out.println(" Digite o valor de n: ");
       double n = s.nextInt();
        
        div (n);
    }
}