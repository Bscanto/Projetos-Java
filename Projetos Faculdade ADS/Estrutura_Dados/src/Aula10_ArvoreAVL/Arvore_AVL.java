package Aula10_ArvoreAVL;

class No {
    int valor;
    int altura;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.altura = 1;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreAVL {
    private No raiz;

    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    private int fatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return altura(no.esquerda) - altura(no.direita);
    }

    private No rotacionarDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    private No rotacionarEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    public void inserir(int valor) {
        raiz = inserirNo(raiz, valor);
    }

    private No inserirNo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirNo(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirNo(no.direita, valor);
        } else {
            return no; // Não são permitidas duplicatas
        }

        no.altura = 1 + Math.max(altura(no.esquerda), altura(no.direita));

        int fatorBalanceamento = fatorBalanceamento(no);

        if (fatorBalanceamento > 1 && valor < no.esquerda.valor) {
            return rotacionarDireita(no);
        }

        if (fatorBalanceamento < -1 && valor > no.direita.valor) {
            return rotacionarEsquerda(no);
        }

        if (fatorBalanceamento > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacionarEsquerda(no.esquerda);
            return rotacionarDireita(no);
        }

        if (fatorBalanceamento < -1 && valor < no.direita.valor) {
            no.direita = rotacionarDireita(no.direita);
            return rotacionarEsquerda(no);
        }

        return no;
    }

    private void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerda);
            preOrdem(no.direita);
        }
    }

    public void imprimirPreOrdem() {
        preOrdem(raiz);
        System.out.println();
    }
}

   

public class Arvore_AVL {
     public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(50);
        arvore.inserir(25);

        arvore.imprimirPreOrdem();
    }
}