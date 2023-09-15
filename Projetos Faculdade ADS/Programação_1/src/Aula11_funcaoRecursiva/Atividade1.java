package Aula11_Exercicios;

import java.util.Scanner;

/**
 ▪ Vamos praticar!!
▪ Implemente uma função recursiva que retorna o fatorial de um número
▪ Definição da recursão
▪ fat(0) = 1
▪ fat(1) = 1
▪ fat(n) = n * fat(n – 1)
 */
public class Atividade1 {
    static long fatorial(long n){
        if (n == 0)
         return 1 ;
        else
        return n*fatorial(n-1);
       
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
        System.out.println(" Digite o valor de n: ");
        long n = s.nextInt();
        
           
        System.out.println(fatorial(n));
    }
}
