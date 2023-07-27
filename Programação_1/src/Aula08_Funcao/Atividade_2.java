package Aula08_Funcao;

/**
▪ Criar uma função que recebe 2 inteiros e retorna o menor dele
▪ BÔNUS: Como podemos utilizar a função criada para achar o menor número de 3
inteiros?
 */

import java.util.Scanner;
public class Atividade_2 {
    static int menor_Numero(int num1, int num2){
        
             if (num1 < num2)
              return num1;
             
             else 
               return num2;
    }
 
        public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		String sim , nao;
                int menor;
                int resultado = 0;
                
                System.out.println(" Digite a 1 número : ");
                int num1 = sc.nextInt();
            
                System.out.println(" Digite a 2° número : ");
                int num2 = sc.nextInt();
                
            
                  System.out.println(" Deseja digitar um 3° número? (sim/nao)");
                String resposta = sc.next();
                
                if ( resposta.equals("sim")) {
                    System.out.println(" Digite a 3° número :");
                    int num3 = sc.nextInt();
                     
                            if (num3 < menor_Numero(num1, num2)){
                                 System.out.println(" O menor valor dos 3 numeros é: "+ num3);
                            
                            }else{
                             System.out.println(" O menor valor dos 3 numeros é: " + menor_Numero(num1, num2));
                    }
                   
                      }else{   

                System.out.println(" O menor valor dos 2 numeros é: " + menor_Numero(num1, num2));
                
            }
        }
}
      