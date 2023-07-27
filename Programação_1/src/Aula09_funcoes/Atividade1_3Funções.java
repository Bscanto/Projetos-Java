package Aula09_funcoes;

import java.util.Scanner;
    /*
        ▪ Criar 3 funções com o nome media
▪ media(int a, int b, int c) – que calcula a média aritmética entre os valores
▪ media(double a, double b, int c) – que calcula a média arit. entre os dois primeiros
valores, e soma com o terceiro parâmetro
▪ media(double a, double b, double c) – que calcula a média harmônica entre os 3
valores
    */
public class Atividade1_3Funções {
    
    static void media(int a, int b, int c) {
        System.out.println(" Função media dos 3 valores : ");
        System.out.println((a + b + c) /3 + "\n");
}      
    static double  media(double a, double b, int c){
        System.out.println(" Função media dos 2 valores : ");
      return ((( a + b) / 2) + c);
   
}   
    static double  media(double a, double b, double c){
       return (3 / ((1/a)+(1/b)+(1/c)));
    }
        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            
            media(7,6,8);
            System.out.println(media(7.5,6.5,9)); 
            
            System.out.println("\n Média Harmônica das 3 notas: ");
            System.out.println(media(7.5,8.2,5.4));
        }
}
        