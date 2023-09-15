package Aula04_Vetor;

import java.util.Scanner;
public class max_e_min {
    

    public static void main(String[] args) {
        Scanner meu_scan = new Scanner(System.in);
        System.out.println("Digite os números: ");
        double valor;
        double maior=Double.NEGATIVE_INFINITY;
        double menor=Double.POSITIVE_INFINITY;
        for (int i=0; i<5; i++){
            valor = meu_scan.nextDouble();
            if (valor > maior)
                maior = valor;
            if (valor < menor)
                menor = valor;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}