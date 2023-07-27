package Aula04_Vetor;

import java.util.Scanner;

public class Atividade2_IMC {
    /*
    Faça um programa que leia e armazene as seguintes informações de 5 pessoas:
    ▪ Ler uma String para o nome de cada Pessoa
    ▪ Ler um double para o peso de cada Pessoa
    ▪ Ler um double para a altura de cada Pessoa
    ▪ Construa um vetor que armazena o IMC de cada pessoa
    ▪ Mostre na tela o nome de cada pessoa, e seu IMC respectivo
    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
         String nome[] = new String[5];
         double peso[] = new double [5];
         double altura [] = new double [5];
         double IMC [] = new double [5];
                  
        
        for (int  i = 0; i < 5; i++){
        
          System.out.println(" Digite seu Nome: "); 
          nome [i] = s.next();
          System.out.println(" Digite seu Peso: ");
          peso [i] = s.nextDouble();
          System.out.println(" Digite sua Altura; ");
          altura [i] = s.nextDouble();
          
          
           IMC [i] = peso [i] /( altura[i] * altura[i]);
             
           if ( IMC [i] < 18.5 ) 
           System.out.println(" Abaixo do peso. " ); // SE IMC FOR MENOR QUE 18.5
    
           else if (IMC [i] >= 18.5 && IMC [i] < 25)
           System.out.println(" Peso Normal. "); 
        
           else if ( IMC [i] >= 25 && IMC [i] < 30)
           System.out.println(" Sobre peso.");
        
           else if ( IMC [i] >= 30 && IMC [i] < 35)
           System.out.println(" Obesidade de Grau I. ");
        
           else if ( IMC [i] >= 35 && IMC [i] < 40 )
           System.out.println(" Obesidade de grau II.");
        
          else 
            System.out.println(" Obesidade de grau III ou Mórbida");
            System.out.println(" Nome : " + nome[i] + " O seu IMC é : " + IMC[i]);
        }
    
    }
}
