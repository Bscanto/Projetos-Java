package Aula03_vetor;


import java.util.Scanner;
import java.util.Arrays;

public class Exercicio5 {
     
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in); //método Scanner para entrada de dados
        
         System.out.println(" Digite a razao: "); 
         int razao = s.nextInt();
         
        
        int v[] = new int[10];
        int a_n = 1;
        
        for( int i = 1; i < 10; i++){
            v[0] = 1;
            a_n = a_n + razao;
            v[i] = a_n;
        }
        
        System.out.println(" O VetorA da PA é: " + Arrays.toString(v));
        
        
        a_n = 1;
        for( int i = 0; i <10; i++){
            a_n = a_n * razao;
            v[i] = a_n;
        }
        
        System.out.println(" O VetorB da PG é:" + Arrays.toString(v));

    }
}