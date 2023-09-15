package Aula02_addInicio;

class Nodo {
    int conteudo;
    Nodo proximo;
}
class Lista {
    
    Nodo primeiro;
    
    Lista() {
        primeiro = null;
    }
    void adicionar(int n) {
        // criar modulo e completar atributos
        Nodo novo = new Nodo();
        novo.conteudo = n;
        novo.proximo = null;
        //if condição 
        if (primeiro == null) { 
            primeiro = novo;
        } else {
            Nodo tmp = primeiro;
            while (tmp.proximo != null)
                tmp = tmp.proximo;
            tmp.proximo = novo;
        }
    }
    void imprimir(){
        Nodo auxiliar = primeiro;
        while (auxiliar != null){
            System.out.println(auxiliar.conteudo);
            auxiliar = auxiliar.proximo; // Andar para a direita/proximo
        }
    }
    int contar(){
         int num_ele = 0;
        Nodo auxiliar = primeiro;
        while (auxiliar != null){
            num_ele++;
            auxiliar = auxiliar.proximo; // Andar para a direita/proximo
        }
        return num_ele;
    }
    void mult_2(){
        Nodo auxiliar = primeiro;
        while(auxiliar != null){
            auxiliar.conteudo = auxiliar.conteudo * 2;
            auxiliar = auxiliar.proximo;
        }
    }
}
public class Aula_2 {
    public static void main(String[] args) {
        Lista minha_lista = new Lista();
        minha_lista.adicionar(2);
        minha_lista.adicionar(5);
        minha_lista.adicionar(10);
        minha_lista.adicionar(50);
        minha_lista.adicionar(1);
        
       minha_lista.imprimir();
        System.out.println("");
        
        minha_lista.mult_2();
        minha_lista.imprimir();
        System.out.println("Num Elementos: " + minha_lista.contar());
        Lista lista2 = new Lista();
        lista2.adicionar(2);
    }
}
