package Aula01;

import java.util.Scanner;

public class CalculoIMC {
    /*
    Implementar um programa que recebe o peso (em kgs) e a altura (em metros) 
    e calcula o IMC. O programa deve imprimir na tela a Classificação 
    baseado na seguinte tabela
    
    */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float peso, imc, altura; //DECLARAÇÃO DAS VARIAVEIS 
        
        System.out.println(" Digite seu peso em kg: "); // ENTRADA DO PESO 
       peso = s.nextFloat();
        System.out.println(" Digite sua altura em metros:  "); // ENTRADA DA ALTURA
       altura = s.nextFloat();
        
        imc = peso / (altura * altura); // CALCULO IMC
        
        if ( imc < 18.5 ) 
        System.out.println(" Abaixo do peso. " ); // SE IMC FOR MENOR QUE 18.5
    
        else if ( imc >= 18.5 && imc < 24.9)
        System.out.println(" Peso Normal. "); 
        
        else if ( imc >= 25 && imc < 29.9)
        System.out.println(" Sobre peso.");
        
        else if ( imc >= 30 && imc < 34.9)
            System.out.println(" Obesidade de Grau I. ");
        
        else if ( imc >= 35 && imc < 39.9)
            System.out.println(" Obesidade de grau II.");
        
        else 
        System.out.println(" Obesidade de grau III ou Mórbida");
              
        
        
        
    }
    
}
