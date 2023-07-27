package Aula01;

import java.util.Random;
import java.util.Scanner;

public class IO_Bound_1min_12 {

    
      
        public static void main(String[] args) {
        Scanner meu_scan = new Scanner(System.in);
       
        int valor = 5;
        for (int i=1; i<470000; i++){
            int resultado = i * valor;
            System.out.println(valor + " * "+i+" = " + resultado );
        }
    }
}