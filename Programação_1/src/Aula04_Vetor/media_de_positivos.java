package Aula04_Vetor;

import java.util.Scanner;
public class media_de_positivos {

    public static void main(String[] args) {

        Scanner meu_scan = new Scanner(System.in);
        System.out.println("Digite os números: ");
        double valor;
        double somatorio = 0;
        double contador = 0;
        while (true){
            valor = meu_scan.nextDouble();
            if (valor < 0)
                break;
            somatorio = somatorio + valor;
            contador++;  // contador = contador + 1;
        }
        System.out.println("Somatório: " + somatorio);
        System.out.println("Contador: " + contador);
        if (contador == 0)
            System.out.println("Não foi possível calcular a média");
        else{
            double media = somatorio / contador;
            System.out.println("Média: "+media);
        }
    }
}