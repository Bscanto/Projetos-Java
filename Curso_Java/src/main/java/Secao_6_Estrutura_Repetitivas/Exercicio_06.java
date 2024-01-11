package Secao_6_Estrutura_Repetitivas;

import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores

 */
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o número inteiro N
        System.out.print("Digite um número inteiro (N): ");
        int n = scanner.nextInt();

        // Imprime os divisores de N
        System.out.println("Divisores de " + n + ":");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
