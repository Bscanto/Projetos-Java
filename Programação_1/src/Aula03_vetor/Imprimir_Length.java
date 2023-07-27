package Aula03_vetor;

import java.util.Scanner;

public class Imprimir_Length {

     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //método Scanner para entrada de dados]
        
        String meses [] = { "jan","fev","mar","abri","mai","jun","jul"};
           
               for (int i=meses.length-1; i>=0; i--) { // Assim ele imprime de tras para frente acessando a ultima -1.
             // for (int i=0; i<meses.length; i++) {   // Assim ele imprime normal todas os indices
                  System.out.println(meses[i]);
              }
        
        
        
    }
    
}
