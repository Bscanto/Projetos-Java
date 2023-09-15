package Aula04_Vetor;

import java.util.Scanner;
public class tabuada {

    public static void main(String[] args) {
        Scanner meu_scan = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int valor = meu_scan.nextInt();
        for (int i=1; i<11; i++){
            int resultado = i * valor;
            System.out.println(valor + " * "+i+" = " + resultado);
        }
    }
}