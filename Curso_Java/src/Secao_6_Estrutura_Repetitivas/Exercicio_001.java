
import java.util.Scanner;

/*
 Leia um valor inteiro X (1 <= X <= 1000).
 Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */
public class Exercicio_001 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um valor inteiro X (1 <= X <= 1000): ");
		int x = scanner.nextInt();

		scanner.close();

		if (x < 1 || x > 1000) {
			System.out.println("Por favor, digite um valor no intervalo especificado.");
			return;
		}

		System.out.println("Números ímpares de 1 até " + x + ":");

		for (int i = 1; i <= x; i += 2) {
			System.out.println(i);
		}
	}
}
