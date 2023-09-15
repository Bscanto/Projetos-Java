package Aula10;

import javax.swing.JOptionPane;

/**
 Criar uma função que recebe 1 vetor de String e retorna a string mais longa
 */
public class Atividade5 {
  static String longa(String texto ){
          String[] nomes = new String[3];
        int maior = 0;
        int indicepalavra=0;
        
        int tamanho = nomes.length;

        for (int i = 0; i < tamanho; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º palavra");
        }
        for (int i = 0; i < tamanho; i++) {
            if (maior < nomes[i].length()) {
                maior = nomes[i].length();
                indicepalavra = i;
            }
        }
        System.out.println(" A maior palavra digitada é: "+ nomes[indicepalavra]);
        
        
        return (longa(texto));
        
    }
         public static void main(String[] args) {
      String texto = null;
      
             System.out.println(longa(texto));
    }
}