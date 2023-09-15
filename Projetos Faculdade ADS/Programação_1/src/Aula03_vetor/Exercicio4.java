package Aula03_vetor;
import java.util.Scanner;

/*
 Implementar um algoritmo que lê um valor N 
e criar um vetor com a tabuada de N
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in); //método Scanner para entrada de dados]

         System.out.println(" Informe o valor de n: ");
        int n = s.nextInt();
        
        int vetor[] = new int [n]; 
        int multiplicador = 0;
        int total = 0;
        
    
             for (int x = 0; x < 10; x++) {
             total = n * ++ multiplicador;

             System.out.println(n+ " x " + multiplicador + " = " + total);
        }

    }
}