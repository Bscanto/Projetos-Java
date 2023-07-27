package Aula03_vetor;

import java.util.Scanner;
import java.util.Arrays;

public class exemploVetor {
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); //método Scanner para entrada de dados
        
        int tam = 4;
        int vetor[ ] = new int [tam];    // Pode colocar Double
     
        for (int cont = 0; cont < tam; cont++){
            vetor [cont] = (cont+1 )*2;
          
          System.out.println(" V (" +cont+ "):" + vetor [cont]);
           }
            System.out.println(Arrays.toString(vetor));
       
    }    
}