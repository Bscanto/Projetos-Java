package Aula08_Arvores;

class Nodo {
    int valor;
    Nodo esquerda;
    Nodo direita;

    Nodo(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBinaria {
    Nodo raiz;

    ArvoreBinaria() {
        this.raiz = null;
    }

    void adicionar(int valor) {
        this.raiz = adicionarNo(this.raiz, valor);
    }

    Nodo adicionarNo(Nodo no, int valor) {
        if (no == null) {
            return new Nodo(valor);
        }

        if (valor > no.valor) {
            no.direita = adicionarNo(no.direita, valor);
        } else if (valor < no.valor) {
            no.esquerda = adicionarNo(no.esquerda, valor);
        }

        return no;
    }

   void imprimir() {
        imprimirNo(this.raiz, " ");
    }

    void imprimirNo(Nodo no, String espaco) {
        if (no == null) {
            return;
        }

        String espacoDireita = espaco + "    ";

        imprimirNo(no.esquerda, espacoDireita);

        System.out.println(espaco + no.valor);

        imprimirNo(no.direita, espacoDireita);
    }
}

public class Aula8_ArvoreBinaria {

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(8);
        arvore.adicionar(2);
        arvore.adicionar(4);
        arvore.adicionar(7);
        arvore.adicionar(10);

        System.out.println("Elementos da árvore em ordem:");
        arvore.imprimir();
    }
}
