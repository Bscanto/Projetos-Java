package Aula11_JavaExceptions;

import java.util.ArrayList;

public class Aula11 {

    static int calc_somatorio(ArrayList<Integer> l) {
        int soma = 0;
        for (int i = 0; i < l.size(); i++) {
            soma += l.get(i);
        }
        return soma;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(10);
        try {
            int a = lista.get(1);
            System.out.println(a);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("EXCECAO LANCADA");
        }
        System.out.println(" Somatorio: " + calc_somatorio(lista));
    }
}
