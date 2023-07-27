package Aula01;
import java.util.Scanner;

public class soma_media {
    
    /* 
    Implementar um programa que lê valores até receber um valor negativo, 
    calcula a média de todos os valores positivos digitados
    
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double num, soma = 0; // DECLARAÇÃO DAS VARIAVEIS
        int cont = 0;
        
        do{
            System.out.println("Digite um número"); // ENTRADA DO NUMERO
            num = s.nextDouble(); 
            
            if(num >= 0){ 
                soma = num + soma; 
                cont++;
            }
        } while(num >= 0); 
        
        System.out.println("A soma é " + soma); 
        System.out.println("A quantidade de números digitados foi " + cont); 
        System.out.println("A média é " + soma / cont); 
        
    }
    
}
