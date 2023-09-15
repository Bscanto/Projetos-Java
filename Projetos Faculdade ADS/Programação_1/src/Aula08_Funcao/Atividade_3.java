package Aula08_Funcao;

import java.util.Scanner;

/**
 ▪ Criar uma função que recebe 3 parâmetros
▪ min
▪ max
▪ passo
▪ A função deve contar de ‘min’ até ‘max’, espaçando a contagem com ‘passo’
 */
public class Atividade_3 {
    
    static int contagem (int min, int max, int passo){
   for (int i = min; i <= max; i++) {
            if (i % passo == 0) {
                System.out.print(i + ",");
            }
        }
      
        return 0;
    }
    public static void main(String[] args){
          Scanner leia = new Scanner(System.in);
        
        int min, max, passo;  // DECLARAÇÃO DAS VARIAVEIS
        int resultado=0;
        System.out.println(" Digite o valor mínimo"); 
        min = leia.nextInt();
        System.out.println(" Digite o valor máximo "); 
        max = leia.nextInt();
        System.out.println(" Digite o valor do passo "); 
        passo = leia.nextInt();
        
        resultado =(int) contagem (min,max,passo);
        System.out.println(+ resultado);
    }
}