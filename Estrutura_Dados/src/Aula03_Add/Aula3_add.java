
package Aula03_Add;

class Nodo{
    int conteudo;
    Nodo proximo;
    
    Nodo(){ //construtor vazio
        conteudo = 0;
        proximo = null;
    }
    Nodo(int t){ //construtor texto
        conteudo = t;
        proximo = null;
    }
}

class Lista{
    Nodo primeiro;
    Nodo ultimo;
    int tamanho;
    
    Lista(){
        primeiro = ultimo = null;
        tamanho = 0;
    }
    void adicionar_inicio(int t){
        Nodo novo_nodo = new Nodo(t);
        novo_nodo.proximo = primeiro;
        primeiro = novo_nodo;
        if(primeiro.proximo == null)// ultimo elemento da lista
            ultimo = novo_nodo;
    }
    
     void adicionar_Final(int t){
        Nodo novo_nodo = new Nodo(t);
        ultimo.proximo = novo_nodo;
        novo_nodo = ultimo;
    }
     
     
    void imprimir(){
        Nodo temp = primeiro;
        while (temp != null){
            System.out.println(temp.conteudo);
            temp = temp.proximo;
        }
    }
    
    
    int maximo(){
        int max=0;
        Nodo tmp = primeiro;
        while(tmp != null){
            if (tmp.conteudo > max)
                max = tmp.conteudo;
            tmp = tmp.proximo;
        }
        return max;
    }
    
    int somatorio(){
        int somador=0;
        Nodo tmp = primeiro;
        while(tmp != null){
            somador = somador + tmp.conteudo;
            tmp = tmp.proximo;
        }
        return somador;
    }
    
    int contar_elementos(){
        int contador = 0;
        Nodo temp = primeiro;
        while( temp != null){
            contador++;
            temp = temp.proximo;
        }
        return contador;
    }
    
    void imprimir_posicao(int pos){
        Nodo temp = primeiro;
        int pos_atual = 0;
        while (temp != null){
            if (pos_atual == pos)
                break;
            temp = temp.proximo;
            pos_atual++;
        }
        if (temp == null)
            System.out.println("Não existe esta posição");
        else
            System.out.println(temp.conteudo);
    }
}

public class Aula3_add {
    public static void main(String[] args) {
       
        Lista lista = new Lista();
        
        lista.adicionar_inicio(5);
        lista.adicionar_inicio(10);
        lista.adicionar_inicio(15);
        lista.adicionar_inicio(20);
        
        lista.imprimir();
        System.out.println("Primeiro: " + lista.primeiro.conteudo);
        System.out.println("Ultimo: " + lista.ultimo.conteudo);
        System.out.println("Lista - quant elementos: " + lista.contar_elementos());
        System.out.println( "O max e: " + lista.maximo());
        
        System.out.println("===========");
        
        lista.adicionar_Final(25);
        lista.imprimir();
        System.out.println("Primeiro: " + lista.primeiro.conteudo);
        System.out.println("Ultimo: " + lista.ultimo.conteudo);
        System.out.println("Lista - quant elementos: " + lista.contar_elementos());
       
        
        System.out.println( "O max e: " + lista.maximo());
    }
}
