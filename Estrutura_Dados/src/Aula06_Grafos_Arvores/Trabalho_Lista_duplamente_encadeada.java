package Aula06_Grafos_Arvores;

class Nodo{
    int conteudo;
    Nodo proximo;
    Nodo anterior;
    
    Nodo(){
        conteudo=0;
        proximo=null;
        this.anterior = null;
    }
    
    Nodo(int conteudo){
       this.conteudo = conteudo;
        this.proximo = null;
        this.anterior = null;
    }
}

class Lista{
    Nodo primeiro;
    Nodo ultimo;
    int tamanho;
    
    Lista(){
        this.primeiro =  null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    int size(){
        return tamanho;
    }
    
    void imprimir(){
        Nodo temp = primeiro;
        while (temp != null){
            System.out.println(temp.conteudo);
            temp = temp.proximo;
        }
    }
    
    void adicionar_inicio(int t){
        Nodo novo = new Nodo(t);
        novo.proximo = primeiro;
        primeiro = novo;
        if (primeiro.proximo == null) // último elemento da lista
            ultimo = novo;
        tamanho++;
    }
    
    void adicionar_final(int t){
        Nodo novo = new Nodo(t);
        if (ultimo == null) {
            primeiro = novo;// lista vazia
        } else {
            ultimo.proximo = novo;
        }
        ultimo = novo;
        tamanho++;
    }
    void remover_inicio(){
        if (primeiro != null) {
            primeiro = primeiro.proximo;
            if (primeiro == null) {
                // lista ficou vazia
                ultimo = null;
            }
            tamanho--;
        }
    }
   void remover_Final(){
    if (ultimo != null) {
        if (primeiro == ultimo) {
            // lista com apenas um elemento
            primeiro = null;
            ultimo = null;
        } else {
            Nodo temp = primeiro;
            while (temp.proximo != ultimo){
                temp = temp.proximo;
            }
            temp.proximo = null;
            ultimo = temp;
        }
        tamanho--;
    }
}
}

public class Trabalho_Lista_duplamente_encadeada {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.adicionar_inicio(5);
        lista.adicionar_inicio(10);
        lista.adicionar_inicio(15);
        lista.adicionar_inicio(20);
        lista.imprimir();
        System.out.println("Quantidade de elementos: " + lista.size());
        System.out.println("Primeiro: "+lista.primeiro.conteudo);
        System.out.println("Ultimo: "+lista.ultimo.conteudo);
        
        System.out.println("=====================================");
        
        lista.adicionar_final(25);
        lista.imprimir();
        System.out.println("Quantidade de elementos: " + lista.size());
        System.out.println("Primeiro: "+lista.primeiro.conteudo);
        System.out.println("Ultimo: "+lista.ultimo.conteudo);
        
        
       System.out.println("=====================================");
       
        lista.remover_inicio();
        lista.imprimir();
        System.out.println("Quantidade de elementos: " + lista.size());
        System.out.println("Primeiro: "+lista.primeiro.conteudo);
        System.out.println("Ultimo: "+lista.ultimo.conteudo);
    
        System.out.println("=====================================");
        
        
        lista.remover_Final();
        lista.imprimir();
        System.out.println("Quantidade de elementos: " + lista.size());
        System.out.println("Primeiro: "+lista.primeiro.conteudo);
        System.out.println("Ultimo: "+lista.ultimo.conteudo);
    
    
    }
}