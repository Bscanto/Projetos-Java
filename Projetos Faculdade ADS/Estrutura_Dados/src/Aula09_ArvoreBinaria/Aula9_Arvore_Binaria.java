package Aula09_ArvoreBinaria;
class No {
    int valor;
    No esquerda;
    No direita;

    No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}

class ArvoreBinaria {
    No raiz;

    ArvoreBinaria() {
        this.raiz = null;
    }
    
    void imprimirArvore() {
        imprimirArvoreEmOrdem(this.raiz);
    }

    void imprimirArvoreEmOrdem(No no) {
        if (no == null) {
            return;
        }

        imprimirArvoreEmOrdem(no.esquerda);
        System.out.print(no.valor + " ");
        imprimirArvoreEmOrdem(no.direita);
    }
    

    void adicionar(int valor) {
        this.raiz = adicionarNo(this.raiz, valor);
    }

    No adicionarNo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor > no.valor) {
            no.direita = adicionarNo(no.direita, valor);
        } else if (valor < no.valor) {
            no.esquerda = adicionarNo(no.esquerda, valor);
        }

        return no;
    }

   
    int contar() {
        return contarNos(this.raiz);
    }

    int contarNos(No no) {
        if (no == null) {
            return 0;
        }

        int contarEsquerda = contarNos(no.esquerda);
        int contarDireita = contarNos(no.direita);

        return 1 + contarEsquerda + contarDireita;
    }

    int calcularProfundidade() {
        return calcularProfundidadeNo(this.raiz);
    }

    int calcularProfundidadeNo(No no) {
        if (no == null) {
            return 0;
        }

        int profundidadeEsquerda = calcularProfundidadeNo(no.esquerda);
        int profundidadeDireita = calcularProfundidadeNo(no.direita);

        return 1 + Math.max(profundidadeEsquerda, profundidadeDireita);
    }

    int maiorValor() {
        return encontrarMaiorValor(this.raiz);
    }

    int encontrarMaiorValor(No no) {
        if (no == null) {
            throw new IllegalArgumentException("A arvore esta vazia");
        }

        if (no.direita != null) {
            return encontrarMaiorValor(no.direita);
        }

        return no.valor;
    }

}
public class Aula9_Arvore_Binaria {
     public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(8);
        arvore.adicionar(20);
        arvore.adicionar(4);
        arvore.adicionar(7);
        arvore.adicionar(10);
        arvore.adicionar(18);

        System.out.println("Elementos da arvore em ordem: ");
       arvore.imprimirArvore();

        int totalNos = arvore.contar();
        System.out.println("\nTotal de nos na arvore: " + totalNos);

        int profundidade = arvore.calcularProfundidade();
        System.out.println("Profundidade da arvore: " + profundidade);

        int maiorValor = arvore.maiorValor();
        System.out.println("O maior valor da arvore e: " + maiorValor);
     }
}