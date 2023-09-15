
package Aula01;

import java.util.Scanner;

public class Multiplos3e7Naode2 {
    
    /*
    (ATIVIDADE 1)
    Implementar dois programa que recebem 2 números (<min> e <max>), e conta do <min>
    até <max>
    2º prog: mostrar todos os múltiplos de 3 e 7 que não são múltiplos de 2
    */
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int min, max, soma; // DECLARAÇÃO DAS VARIVEIS
        int i;
         System.out.println(" Digite o valor mínimo"); // ENTRADA DO VALOR MINIMO
        min = leia.nextInt();
        System.out.println(" Digite o valor máximo "); // ENTRADA DO VALOR MAXIMO
        max = leia.nextInt();
        
        
        for (i = min; i<=max; i++) { 
                     
            if(i % 3 == 0 && !(i % 2 == 0))
            System.out.println(" Os multiplos de 3  é :" +i);
            
            
            else if( i % 7 == 0 && !(i % 2 == 0))
            System.out.println(" Os multiplos de 7  é :" +i);
            
         }
    }
}
