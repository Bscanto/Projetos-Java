package ExercicioAvalativo;

import java.util.Scanner;

public class ExercicioAvaliativo {

    public static void main(String[] args) {
        
        Scanner  leia = new Scanner(System.in);
        int x=0, y=0, somapar=0, cont=0, impar = 1;
       
        System.out.println(" Digite o valor de x");
        x = leia.nextInt();
        System.out.println(" Digite o valir de y");
        y = leia.nextInt();
        
        if (y > x) {
            
            for( cont = x; cont <= y; cont++)
            {              
                if(cont%2==0){
                    
                  somapar = somapar + cont;
         
                }
                 else 
                 {
                 impar = impar * cont;
                }
            } 
            System.out.println(" A soma dos numeros pares nesse intervalo é " + somapar);
             System.out.println(" A multiplicação dos números impares nesse intervalo é " + impar);
        }
       else
        {
             System.out.println(" x não pode ser maior que y");
        }
                
                
    }
}