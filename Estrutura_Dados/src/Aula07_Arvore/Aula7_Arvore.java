package Aula07_Arvore;

class Nodo{
    int conteudo;
    Nodo esquerda;
    Nodo direita;
   
    Nodo(int valor ) {
        this.conteudo = valor;
        this.esquerda = null;
        this.direita = null;
    }
    
    void Print(){
        if( esquerda != null)
            esquerda.Print();
        System.out.println(conteudo);
        
        if(direita !=null)
            direita.Print();
    }
    
   void adicionar(int valor) {
        if (valor < conteudo) {
            if (esquerda == null) {
                esquerda = new Nodo(valor);
            } else {
                esquerda.adicionar(valor);
            }
        } else if (valor > conteudo) {
            if (direita == null) {
                direita = new Nodo(valor);
            } else {
                direita.adicionar(valor);
            }
        } 
   }
   
   int somatorio(){
       int soma = conteudo;
       if(esquerda != null){
           soma += esquerda.somatorio();
       } if(direita != null){
           soma += direita.somatorio();
       }
       return soma;
   }

}
public class Aula7_Arvore {
    public static void main(String[] args) {
        Nodo raiz = new Nodo (5);
        
        raiz.adicionar(7);
        raiz.adicionar(2);
        raiz.adicionar(5);
        raiz.adicionar(9);
        System.out.println("Somarorio da arvore: " + raiz.somatorio());
//        Nodo filho = new Nodo(5);
//        raiz.esquerda = new Nodo(5);
//        raiz.esquerda.direita = new Nodo(7);
//        raiz.esquerda.esquerda = new Nodo(3);
//        raiz.direita = new Nodo(11);
//        raiz.direita.direita = new Nodo(13);
         
        raiz.Print();
                
                
                
    }
}
