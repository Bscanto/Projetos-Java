package Aula03_vetor;

import java.util.Arrays;
import java.util.Scanner;

/* 
Implemente um algoritimo que lê um valor n, e cria um vetor que armazena
os primeiros N números par.
*/
public class Exercicio1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //método Scanner para entrada de dados]
        
         System.out.println("Digite o valor de N: ");
         int n = entrada.nextInt();
         
        int vetor[] = new int [n]; 
        int soma = vetor[0] + vetor[1];
        vetor[0] = 1;
         vetor[1] = 1;
        
        for (int i = 2; i < n; i++){
            vetor [i] = vetor[i-1] *3 -1;
             soma = soma + vetor[i];
          }
            System.out.println(Arrays.toString(vetor));
             System.out.println(" A Soma é: " + soma);
            
    }
        
}