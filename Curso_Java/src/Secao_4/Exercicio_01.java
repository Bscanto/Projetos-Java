package Secao_4;

import java.util.Scanner;

/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 */
public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A;
		int B;
		int soma;
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		soma = A + B;
		
		System.out.println("Soma = " + soma);
		
	}

}
