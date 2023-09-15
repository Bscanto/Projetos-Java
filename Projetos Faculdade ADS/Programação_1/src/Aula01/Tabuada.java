package Aula01;
import java.util.Scanner;

public class Tabuada {
    
    /*
    Implementar um programa que lê um número, e imprime a tabuada dele
    
    */
             public static void main(String[] args) {
                  Scanner s = new Scanner(System.in);
    
              
               int numero;
               int multiplicador = 0;
               int total = 0;
              
                 System.out.println(" Informe um número: ");
                 numero = s.nextInt();

                     for (int x = 0; x < 10; x++) {
                     total = numero * ++multiplicador;
                     System.out.println(numero + " x " + multiplicador + " = " + total);
        }

    }
}