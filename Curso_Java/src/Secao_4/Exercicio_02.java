package Secao_4;

import java.util.Locale;
import java.util.Scanner;

/*
 Faca um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}
}
