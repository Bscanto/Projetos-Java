package Aula03_vetor;

import java.util.Scanner;

/*
 Implementar um algoritmo que lê um valor N. Após isso cria e mostra o quadrado dos N
primeiros inteiros.
 Exemplo: N = 5
 Imprime:
0² = 0
1² = 1
2² = 4              5
3² = 9
4² = 16
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in); //método Scanner para entrada de dados]
    
         System.out.println("Digite o valor de N: ");
         int n = s.nextInt();
         int vetor[] = new int [n]; 
         
         
          for (int cont = 0; cont < n; cont++){
            vetor [cont] =   (cont)* cont;
          
            System.out.println( cont + "²"  + " = " + vetor [cont]);
        }
    }  
}
