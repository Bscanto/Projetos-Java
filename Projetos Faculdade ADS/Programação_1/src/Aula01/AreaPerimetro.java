package Aula01;

import java.util.Scanner;

public class AreaPerimetro {
    /* (ATIVIDADE 1)
    Implementar um programa que recebe os dois lados de um retângulo e imprime sua área
    e seu perímetro*/
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
       
      int base, altura, areaRetangulo, perimetro;// DECLARAÇÃO DAS VARIAVEIS 
 
         System.out.println(" Digite a base do retângulo");// ENTRADA DA BASE DO RETANGULO
        base = leia.nextInt();
        System.out.println(" Digite a altura do retângulo ");// ENTRADA COM A ALTURA DO RETANGULO
        altura = leia.nextInt();
        
    areaRetangulo = base * altura; // CALCULO AREA DE UM RETANGULO
    perimetro = base * 2 + altura * 2; // CALCULO DO PERIMETRO DE UM RETANGULO
 
 System.out.println(" A area total do retângulo é : " + areaRetangulo); // RESULTADO DA AREA DO RETANGULO 
 System.out.println("e o Perimetro é : " + perimetro); // RESULTADO DO PERIMETRO DO RETANGULO
 
 }
}