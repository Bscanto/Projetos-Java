
package Aula01;

import java.util.Scanner;

public class Multiplos3e5 {
    
    /*
    (ATIVIDADE 1)
    ▪ Implementar dois programa que recebem 2 números (<min> e <max>), e conta do <min>
     até <max>
    1º prog: mostrar todos os múltiplos de 3 ou 5
    
    */
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int min, max;  // DECLARAÇÃO DAS VARIAVEIS
        int i;
         System.out.println(" Digite o valor mínimo"); // ENTRADA DO VALOR MINIMO
        min = leia.nextInt();
        System.out.println(" Digite o valor máximo "); // ENTRADA DO VALOR MAXIMO
        max = leia.nextInt();
        
        
        for (i = min; i<=max; i++) { // INCREMENTO CONTAGEM DOS NUMEROS INSERIDOS
            //System.out.println(" a variavel é " +i );
           
            if(i % 3 == 0 ) //MULTIPLOS DE 3 DENTRO DOS NUMEROS INFORMADOS 
            System.out.println(" Os multiplos de 3  é :" +i);
            
           if( i % 5 == 0) ////MULTIPLOS DE 5 DENTRO DOS NUMEROS INFORMADOS 
            System.out.println(" Os multiplos de 5  é :" +i);
            
         }
           
        
        
        
        
    }
}
