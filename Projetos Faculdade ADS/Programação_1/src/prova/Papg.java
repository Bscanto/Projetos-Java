package prova;

import java.util.Scanner;
import java.util.Scanner;

public class Papg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
         int val_inicial = 5;
         int qtd_valores = 10;
         int razao = 5;
         int PA = val_inicial;
         int N = 0;
         
         while (N < qtd_valores){
             System.out.println(PA);
             PA *= razao;
             ++N;
        
         }
    }
}
  
