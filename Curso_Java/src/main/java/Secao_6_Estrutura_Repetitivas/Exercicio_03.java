package Secao_6_Estrutura_Repetitivas;

import java.util.Scanner;

/*
 Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que
 o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lê o número de casos de teste (N)
		System.out.print("Digite o número de casos de teste (N): ");
		int n = scanner.nextInt();

		// Processa cada caso de teste
		for (int i = 0; i < n; i++) {
			// Lê os 3 valores reais
			System.out.print("Digite o primeiro valor real: ");
			double a = scanner.nextDouble();

			System.out.print("Digite o segundo valor real: ");
			double b = scanner.nextDouble();

			System.out.print("Digite o terceiro valor real: ");
			double c = scanner.nextDouble();

			// Calcula a média ponderada
			double mediaPonderada = (a * 2 + b * 3 + c * 5) / 10.0;

			// Imprime a média ponderada
			System.out.printf("Média ponderada para o caso de teste #%d: %.1f%n", i + 1, mediaPonderada);
		}

		scanner.close();
	}
}
