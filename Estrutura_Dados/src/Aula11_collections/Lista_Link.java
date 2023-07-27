package Aula11_collections;

import java.util.ArrayList;
import java.util.Random;

public class Lista_Link {

    public static void main(String[] args) {
        ArrayList<String> Lista = new ArrayList<>() {
        };
        Random random = new Random();

        int listaTotal = 10000;// Defina o número total de palavras que você deseja gerar

        while (Lista.size() < listaTotal) {// Gere as palavras aleatoriamente até atingir o total desejado
            String Hello = generateRandomWord();
            Lista.add(Hello);
        }

        for (String word : Lista) {// Exiba as palavras geradas
            System.out.println(word);
        }
    }

    // Método para gerar uma palavra aleatória
    public static String generateRandomWord() {
        Random Palavras = new Random();
        int length = Palavras.nextInt(10) + 1; // 
        StringBuilder Nova = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char ch = (char) (Palavras.nextInt(26) + 'a');
            Nova.append(ch);
        }

        return Nova.toString();
    }
}
