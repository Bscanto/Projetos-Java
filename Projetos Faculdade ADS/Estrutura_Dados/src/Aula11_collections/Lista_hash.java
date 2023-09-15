
package Aula11_collections;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author bruno
 */
public class Lista_hash {
     public static void main(String[] args) {
        HashSet<String> MundoSet = new HashSet<>();
        Random random = new Random();

        // Defina o número total de palavras que você deseja gerar
        int Total = 10000;

        // Gere as palavras aleatoriamente até atingir o total desejado
        while (MundoSet.size() < Total) {
            String word = generateRandomWord();
            MundoSet.add(word);
        }

        // Exiba as palavras geradas
        for (String word : MundoSet) {
            System.out.println(MundoSet.contains("bua"));
        }
    }

    // Método para gerar uma palavra aleatória
    public static String generateRandomWord() {
        Random random = new Random();
        int length = random.nextInt(5) + 1; 
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            // Gere um caractere aleatório entre 'a' e 'z'
            char ch = (char) (random.nextInt(26) + 'a');
            sb.append(ch);
        }

        return sb.toString();
    }
}
