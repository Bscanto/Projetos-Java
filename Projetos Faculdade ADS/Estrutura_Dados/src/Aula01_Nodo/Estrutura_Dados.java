package Aula01_Nodo;

class Nodo{
    int valor;
    Nodo proximo;
  } 

public class Estrutura_Dados {
    public static void main(String[] args) {
     Nodo primeiro_nodo;
        primeiro_nodo = new Nodo();
        primeiro_nodo.valor = 1;
        
        Nodo segundo_nodo = new Nodo();
        segundo_nodo.valor = 2;
        primeiro_nodo.proximo = segundo_nodo;
        
        Nodo terceiro_nodo = new Nodo();
        terceiro_nodo.valor = 3;
        segundo_nodo.proximo = terceiro_nodo;
        
        Nodo quarto_nodo = new Nodo();
        quarto_nodo.valor = 4;
        terceiro_nodo.proximo = quarto_nodo;
        
        Nodo quinto_nodo = new Nodo();
        quinto_nodo.valor = 5;
        quarto_nodo.proximo =quinto_nodo;
        
        
        quinto_nodo.proximo = null;
        
      
             
        // Código para percorrer e mostrar os valores da Lista
        Nodo nodo_tmp = primeiro_nodo;
        while (nodo_tmp != null){
            System.out.println(nodo_tmp.valor);
            nodo_tmp = nodo_tmp.proximo;
        }
        System.out.println("Final do programa");
    }
}
