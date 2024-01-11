package Secao_6_Estrutura_Repetitivas;

import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o valor inteiro N
        System.out.print("Digite a quantidade de valores inteiros (N): ");
        int n = scanner.nextInt();

        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        // Lê os valores inteiros X e verifica se estão dentro ou fora do intervalo
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor inteiro X: ");
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }

        // Imprime as informações
        System.out.println("Valores dentro do intervalo [10, 20]: " + dentroIntervalo);
        System.out.println("Valores fora do intervalo [10, 20]: " + foraIntervalo);

        scanner.close();
    }
}
