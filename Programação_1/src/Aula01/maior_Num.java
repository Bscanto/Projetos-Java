package Aula01;
import java.util.Scanner;

public class maior_Num {
    
    /*
     Implementar um programa que lê 5 números e imprime o maior deles
    
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float maior, numero;
        int cont = 0;
        
        do{
        System.out.println(" Digite os números:");
        numero = s.nextFloat();
        
       maior = numero;
        }
       
       while (cont == 5);{
            System.out.println(" Número" + cont + ":" );
          numero = s.nextFloat();
              cont++;
              
          if (numero > maior){
              maior = numero;
               
          }
       }
      System.out.println(" O maior numero é: " + maior);
       
    }
}