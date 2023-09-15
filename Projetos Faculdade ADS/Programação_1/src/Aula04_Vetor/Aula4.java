
package Aula04_Vetor;

import java.util.Scanner;

public class Aula4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //método Scanner para entrada de dados]
    
         String meses [] = { "jan","fev","mar","abri","mai","jun","jul"};
         int dias [] = { 31, 28, 31, 30};
    
              for (int i=0; i<4; i++) { 
             // for (int i=0; i<meses.length; i++) {  
                  System.out.println("Mês " +meses[i]+ ": " +dias[i]+"dias ");
              }
}
}
