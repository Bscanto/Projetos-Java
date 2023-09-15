
package Aula05_Pilha;

import java.util.Stack;

public class Pilha {
     Stack<Integer> pilha;
    
     Pilha() {
        pilha = new Stack<>();
    }
    
     void push(int elemento) {
        pilha.push(elemento);
    }
    
     int pop() {
        if (!pilha.isEmpty()) {
            return pilha.pop();
        }
         System.out.println("Pilha vazia");
         return 0;
     }
     
    
     int peek() {
        if (!pilha.isEmpty()) {
            return pilha.peek();
        }
        throw new RuntimeException("Pilha vazia");
    }
    
     boolean isEmpty() {
        return pilha.isEmpty();
    }
    
     int size() {
        return pilha.size();
    }
    
    void clear() {
        pilha.clear();
    }
    
public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());
        
        int elemento = pilha.pop();
        System.out.println("Elemento desempilhado: " + elemento);
        
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("Topo da pilha: " + pilha.peek());
        
        pilha.clear();
        System.out.println("Pilha vazia? " + pilha.isEmpty());
    }
}