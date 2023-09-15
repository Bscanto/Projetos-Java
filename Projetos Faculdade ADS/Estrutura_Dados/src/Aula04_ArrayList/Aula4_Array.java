package Aula04_ArrayList;

import java.util.ArrayList;


public class Aula4_Array {
    public static void main(String[] args) {
      // Criar um ArrayList vazio com capacidade inicial de 10 elementos
      ArrayList<String> lista = new ArrayList<String>(10);

      // Adicionar elementos à lista
      lista.add("elemento1");
      lista.add("elemento2");
      lista.add("elemento3");
      lista.add("elemento4");
      lista.add("elemento5");

      // Acessar elementos da lista por índice
      String elemento1 = lista.get(0);
      String elemento2 = lista.get(1);

      // Remover um elemento da lista
      lista.remove(2);

      // Percorrer a lista e exibir seus elementos
      for (String elemento : lista) {
         System.out.println(elemento);
      }

      // Verificar se a lista contém um elemento específico
      boolean contemElemento1 = lista.contains("elemento1");

      // Verificar o tamanho atual da lista
      int tamanhoLista = lista.size();
        System.out.println("Quantidade de elementos: "+ lista.size());
      // Limpar a lista
       
      lista.clear();
      System.out.println("Quantidade de elementos: "+ lista.size());
   }
}