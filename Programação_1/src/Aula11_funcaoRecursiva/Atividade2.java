
package Aula11_Exercicios;

import java.util.Scanner;

/**
 ▪ Vamos praticar!!
▪ Implemente uma função recursiva que retorna o Nº elemento da sequência de Fibonacci
▪ Sequência de Fibonnaci
0,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597 ...
▪ Definição
▪ fib(1) = 0
▪ fib(2) = 1
▪ fib(n) = fib(n-1) + fib(n-2)
 */
public class Atividade2 {
    static int fibo(int n){
       if (n <=1)
        return n;
        else
        return fibo(n-1) + fibo(n-2);
       
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
        System.out.println(" Digite o valor de n: ");
        int n = s.nextInt();
        
           
        System.out.println(fibo(n));
    }
}