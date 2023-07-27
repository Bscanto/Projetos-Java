package Aula03_vetor;


import java.util.Scanner;

public class Vetor {

      public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //método Scanner para entrada de dados
        int vetor[ ]= {1, 5, 30, 22};
       // vetor[2] = vetor[3] + 1; // 22+1
       // vetor [0] = vetor[1] + vetor [2]; // 28
        
        for (int cont = 0; cont < 4; cont++){
          System.out.println(vetor [cont]);
          
        }
    }
 }