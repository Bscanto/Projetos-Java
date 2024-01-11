package Secao_6_Estrutura_Repetitivas;

import java.util.Scanner;

/*
 Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
 */
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número N
        System.out.print("Digite o número de pares a serem lidos (N): ");
        int n = scanner.nextInt();

        // Processa N pares de números
        for (int i = 0; i < n; i++) {
            // Lê os dois números do par
            System.out.print("Digite o primeiro número: ");
            double numerador = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double denominador = scanner.nextDouble();

            // Verifica se o denominador é zero
            if (denominador != 0) {
                // Calcula e exibe a divisão
                double resultado = numerador / denominador;
                System.out.printf("Resultado da divisão: %.2f%n", resultado);
            } else {
                // Exibe a mensagem "divisao impossivel"
                System.out.println("Divisao impossivel");
            }
        }

        scanner.close();
    }
}
