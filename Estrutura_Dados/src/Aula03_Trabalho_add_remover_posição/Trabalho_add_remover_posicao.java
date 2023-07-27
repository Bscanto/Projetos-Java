
package Aula03_Trabalho_add_remover_posição;
class Nodo {
    private String nome;

    Nodo(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    void setNome(String nome) {
        this.nome = nome;
    }
}

class NodoLista {
    private Object dado;
    private NodoLista proximo;

    NodoLista(Object dado) {
        this.dado = dado;
        this.proximo = null;
    }

    void setProximo(NodoLista proximo) {
        this.proximo = proximo;
    }

    NodoLista getProximo() {
        return this.proximo;
    }

    Object getDado() {
        return this.dado;
    }

    void setDado(Object dado) {
        this.dado = dado;
    }
}

class Lista {
    private NodoLista cabeca;
    private int tamanho;

    Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    void adicionar(Object dado, int indice) {
        if (indice < 0 || indice > tamanho) {
            System.out.println("Índice inválido: " + indice);
            return;
        }
        NodoLista novoNodo = new NodoLista(dado);
        if (indice == 0) {
            novoNodo.setProximo(cabeca);
            cabeca = novoNodo;
        } else {
            NodoLista nodoAnterior = getNodo(indice - 1);
            novoNodo.setProximo(nodoAnterior.getProximo());
            nodoAnterior.setProximo(novoNodo);
        }
        tamanho++;
    }

    void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }
        if (indice == 0) {
            cabeca = cabeca.getProximo();
        } else {
            NodoLista nodoAnterior = getNodo(indice - 1);
            nodoAnterior.setProximo(nodoAnterior.getProximo().getProximo());
        }
        tamanho--;
    }

    NodoLista getNodo(int indice) {
        NodoLista nodoAtual = cabeca;
        for (int i = 0; i < indice; i++) {
            nodoAtual = nodoAtual.getProximo();
        }
        return nodoAtual;
    }

    void imprimirLista() {
        NodoLista nodoAtual = cabeca;
        while (nodoAtual != null) {
            System.out.print(((Nodo) nodoAtual.getDado()).getNome() + " ");
            nodoAtual = nodoAtual.getProximo();
        }
        System.out.println();
    }
}
public class Trabalho_add_remover_posicao {
    
    public static void main(String[] args) {
       Lista listaPessoas = new Lista();

        Nodo pessoa1 = new Nodo("Joao");
        Nodo pessoa2 = new Nodo("Maria");
        Nodo pessoa3 = new Nodo("Jose");
        Nodo pessoa4 = new Nodo("Pedro");

        listaPessoas.adicionar(pessoa1, 0);
        listaPessoas.adicionar(pessoa2, 1);
        listaPessoas.adicionar(pessoa3, 1);
        listaPessoas.adicionar(pessoa4, 3);

        System.out.println("Lista atual:");
        listaPessoas.imprimirLista();

        listaPessoas.remover(2);

        System.out.println("Lista após remover o elemento de índice 2:");
        listaPessoas.imprimirLista();
    }
}