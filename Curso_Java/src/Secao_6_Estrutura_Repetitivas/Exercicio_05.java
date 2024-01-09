package Secao_5;

import java.util.Scanner;

/*
 Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1
 */
public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lê o valor N
		System.out.print("Digite um valor para calcular o fatorial (N): ");
		int n = scanner.nextInt();

		// Calcula o fatorial
		long fatorial = calcularFatorial(n);

		// Imprime o resultado
		System.out.println("O fatorial de " + n + " é: " + fatorial);

		scanner.close();
	}

	// Função para calcular o fatorial
	private static long calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1; // Por definição, fatorial de 0 e 1 é 1
		} else {
			// Calcula o fatorial utilizando um loop
			long resultado = 1;
			for (int i = 2; i <= n; i++) {
				resultado *= i;
			}
			return resultado;
		}
	}
}