package Aula01_Nodo;

class Nodo1 {
    int valor;
    Nodo1 proximo;

    public Nodo1(int valor) {
        this.valor = valor;
    }
}
public class Exercicio1_lista1000 {
   public static void main(String[] args) {
        // cria a lista encadeada com 1000 elementos
        Nodo1 primeiro_nodo = new Nodo1(1);
        Nodo1 atual = primeiro_nodo;
        for (int i = 1; i <= 999; i++) {
            atual.proximo = new Nodo1(i);
            atual = atual.proximo;
        }

        // percorre a lista e imprime cada valor incrementado em 1
        atual = primeiro_nodo;
        while (atual != null) {
            System.out.println(atual.valor + 1);
            atual = atual.proximo;
        }
    }
}
