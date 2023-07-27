package Aula08_Funcao;

import java.util.Scanner;

/**
 ▪ Crie uma função mostraPG, que recebe os seguintes parâmetros
▪ a0 – termo inicial da PG
▪ razao – razão da PG
▪ num_termos – quantidade de elementos da PG
▪ E mostra todos os elementos da PG, e retornar o somatório de todos os elementos
 */
public class Atividade_5 {
    static int PG (int aO, int razao,int num_termos){
     for (int x= aO; x< num_termos; x++){
         aO *= razao;
         System.out.println("Termo" + x + ":" + aO);
     }
        return aO;
    }
        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
        
       int aO, razao, num_termos; 
       int resultado = 0;
       int soma =0;
       
         System.out.println(" Digite o primeiro termo: "); 
         aO = s.nextInt();
         System.out.println(" Digite a razao: ");
         razao = s.nextInt();
          System.out.println(" Digite a numero de termos: ");
         num_termos = s.nextInt();
         
        
             resultado = PG (aO, razao, num_termos);
            
        
         for(int i = 2; i <= num_termos; i++){
            soma += resultado;
        }
        System.out.println("A soma da PG foi: " +  soma);
        }
}