package Aula02_addInicio;

/*
Utilizando como base as classes Lista e Nodo, implemente os seguintes métodos

* int calcular_somatorio()
* double calcular_media()
* void adicionar_inicio(int n)
* retornar_maior()
* Nodo remover_inicio()
*/
class Nodo1 {
    private int valor;
    private Nodo1 proximo;

    public Nodo1(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo1 getProximo() {
        return proximo;
    }

    public void setProximo(Nodo1 proximo) {
        this.proximo = proximo;
    }
}

class Lista2 {
    private Nodo1 primeiro;
    private int tamanho;

    public Lista2() {
        this.primeiro = null;
        this.tamanho = 0;
    }

void adicionarInicio(int n) {
        Nodo1 novoNodo = new Nodo1(n);
        if (this.primeiro == null) {
            this.primeiro = novoNodo;
        } else {
            novoNodo.setProximo(this.primeiro);
            this.primeiro = novoNodo;
        }
        this.tamanho++;
    }

Nodo1 removerInicio() {
        if (this.primeiro == null) {
            return null;
        } else {
            Nodo1 nodoRemovido = this.primeiro;
            this.primeiro = this.primeiro.getProximo();
            nodoRemovido.setProximo(null);
            this.tamanho--;
            return nodoRemovido;
        }
    }

Nodo1 retornarMaior() {
        if (this.primeiro == null) {
            return null;
        } else {
            Nodo1 maior = this.primeiro;
            Nodo1 atual = this.primeiro;
            while (atual != null) {
                if (atual.getValor() > maior.getValor()) {
                    maior = atual;
                }
                atual = atual.getProximo();
            }
            return maior;
        }
    }

int calcularSomatorio() {
        int soma = 0;
        Nodo1 atual = this.primeiro;
        while (atual != null) {
            soma += atual.getValor();
            atual = atual.getProximo();
        }
        return soma;
    }

double calcularMedia() {
        if (this.tamanho == 0) {
            return 0;
        } else {
            int soma = this.calcularSomatorio();
            return (double) soma / this.tamanho;
        }
    }
}
public class Trabalho {
     public static void main(String[] args) {
        
   
        Lista2 lista = new Lista2();
        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarInicio(30);
        lista.adicionarInicio(40);
        lista.adicionarInicio(50);

        System.out.println("Somatório: " + lista.calcularSomatorio());
        System.out.println("Média: " + lista.calcularMedia());

        Nodo1 maior = lista.retornarMaior();
        if (maior != null) {
            System.out.println("Maior valor: " + maior.getValor());
        } else {
            System.out.println("Lista vazia");
        }

        Nodo1 removido = lista.removerInicio();
        if (removido != null) {
            System.out.println("Valor removido: " + removido.getValor());
        } else {
            System.out.println("Lista vazia");
        }
    }
}