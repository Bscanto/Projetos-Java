package Secao_5;

import java.util.Locale;
import java.util.Scanner;

/*
 Fazer um programa para ler um número inteiro positivo N.
 O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o
número da linha, depois o quadrado e o cubo do valor, conforme
exemplo
 */
public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Lê o número inteiro positivo N
		System.out.print("Digite um número inteiro positivo (N): ");
		int n = scanner.nextInt();

		// Imprime as N linhas com número da linha, quadrado e cubo
		System.out.println("Resultados:");

		for (int i = 1; i <= n; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;

			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}

		scanner.close();
	}
}