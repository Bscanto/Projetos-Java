package Aula09_funcoes;
import java.util.Random;
import java.util.Scanner;
/**
 ▪ Criar uma função que recebe um inteiro N, e retorna um vetor de tamanho N com
    números aleatórios
 */
public class Atividade5_ReceberValor_AleatorioNoVetor {
      
            static void Vetor_Randon(int vetor []) {
            for(int i = 0; i < vetor.length; i++) {
            int[] gerador = null;
            vetor[i] = gerador[vetor.length];
            }
        }
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random gerador = new Random();
        
        System.out.print("Digiteo Tamanho desejado do Vetor: ");
           int n = s.nextInt();
           int vetor[];
           
              for(int i = 0; i < n; i++){
                System.out.println(" O Vetor ["+i+"] = " + gerador.nextInt(10));
              }  
    }
}   