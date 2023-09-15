package Aula08_Funcao;

import java.util.Scanner;

/**
Crie uma função contaPalavras, que recebe uma string e retorna quantas palavras tem

 */
public class Atividade_6 {
    
   static  int contaPalavras(String frase){
    
            int ler = frase.split(" ", -1).length - 1;
            return ler+1;
   }
   
    public static void main(String[] args) {
           Scanner s = new Scanner(System.in); 
       int resultado =0;
       
       System.out.print("digite uma frase: ");
       String frase = s.nextLine();
       
       resultado = contaPalavras( frase);
        System.out.println(" A frase tem " + resultado + " Palavra");
           
   }
    }
   