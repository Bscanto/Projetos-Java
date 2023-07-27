package Aula09_deite_OrdemPrePro;
import java.security.SecureRandom;

// Definição da classe NodoArvore
class NodoArvore<T extends Comparable<T>> {
   // Membros de acesso do pacote
   NodoArvore<T> nodoEsquerda;
   T dado; // valor do nó
   NodoArvore<T> nodoDireita;

   // Construtor inicializa o dado e torna este um nó folha
   public NodoArvore(T dadoNodo) {
      dado = dadoNodo;
      nodoEsquerda = nodoDireita = null; // o nó não possui filhos
   }

   // Localiza o ponto de inserção e insere um novo nó; ignora valores duplicados
   public void inserir(T valorInserir) {
      // Inserir na subárvore esquerda
      if (valorInserir.compareTo(dado) < 0) {
         // Inserir novo NodoArvore
         if (nodoEsquerda == null)
            nodoEsquerda = new NodoArvore<T>(valorInserir);
         else // Continuar percorrendo a subárvore esquerda recursivamente
            nodoEsquerda.inserir(valorInserir);
      }
      // Inserir na subárvore direita
      else if (valorInserir.compareTo(dado) > 0) {
         // Inserir novo NodoArvore
         if (nodoDireita == null)
            nodoDireita = new NodoArvore<T>(valorInserir);
         else // Continuar percorrendo a subárvore direita recursivamente
            nodoDireita.inserir(valorInserir);
      }
   }
} // Fim da classe NodoArvore

// Definição da classe Tree
class Arvore<T extends Comparable<T>> {
   private NodoArvore<T> raiz;

   // Construtor inicializa uma árvore vazia de inteiros
   public Arvore() {
      raiz = null;
   }

   // Inserir um novo nó na árvore de pesquisa binária
   public void inserirNodo(T valorInserir) {
      if (raiz == null)
         raiz = new NodoArvore<T>(valorInserir); // criar nó raiz
      else
         raiz.inserir(valorInserir); // chamar o método inserir
   }

   // Iniciar percurso pré-ordem
   public void percursoPreOrdem() {
      percursoPreOrdemAuxiliar(raiz);
   }

   // Método recursivo para realizar percurso pré-ordem
   private void percursoPreOrdemAuxiliar(NodoArvore<T> nodo) {
      if (nodo == null)
         return;

      System.out.printf("%s ", nodo.dado); // exibir dado do nó
      percursoPreOrdemAuxiliar(nodo.nodoEsquerda); // percorrer subárvore esquerda
      percursoPreOrdemAuxiliar(nodo.nodoDireita); // percorrer subárvore direita
   }

   // Iniciar percurso em ordem
   public void percursoEmOrdem() {
      percursoEmOrdemAuxiliar(raiz);
   }

   // Método recursivo para realizar percurso em ordem
   private void percursoEmOrdemAuxiliar(NodoArvore<T> nodo) {
      if (nodo == null)
         return;

      percursoEmOrdemAuxiliar(nodo.nodoEsquerda); // percorrer subárvore esquerda
      System.out.printf("%s ", nodo.dado); // exibir dado do nó
      percursoEmOrdemAuxiliar(nodo.nodoDireita); // percorrer subárvore direita
   }

   // Iniciar percurso pós-ordem
   public void percursoPosOrdem() {
      percursoPosOrdemAuxiliar(raiz);
   }

   // Método recursivo para realizar percurso pós-ordem
   private void percursoPosOrdemAuxiliar(NodoArvore<T> nodo) {
      if (nodo == null)
         return;

      percursoPosOrdemAuxiliar(nodo.nodoEsquerda); // percorrer subárvore esquerda
      percursoPosOrdemAuxiliar(nodo.nodoDireita); // percorrer subárvore direita
      System.out.printf("%s ", nodo.dado); // exibir dado do nó
   }
}
public class deitel {
      public static void main(String[] args) {
      Arvore<Integer> arvore = new Arvore<Integer>();
      SecureRandom numeroAleatorio = new SecureRandom();

      System.out.println("Inserindo os seguintes valores:");

      // Inserir 10 números inteiros aleatórios de 0 a 99 na árvore
      for (int i = 1; i <= 10; i++) {
         int valor = numeroAleatorio.nextInt(20);
         System.out.printf("%d ", valor);
         arvore.inserirNodo(valor);
      }

      System.out.printf("%n%nPercurso pré-ordem%n");
      arvore.percursoPreOrdem();

      System.out.printf("%n%nPercurso em ordem%n");
      arvore.percursoEmOrdem();

      System.out.printf("%n%nPercurso pós-ordem%n");
      arvore.percursoPosOrdem();
      System.out.println();
   }
}