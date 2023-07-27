
package Aula05_Fila;

import java.util.LinkedList;
import java.util.Queue;

class Node {
     Object item;

    Node(Object d) {
        this.item = d;
    }

     Object getData() {
        return item;
    }

     void setData(Object d) {
        this.item = d;
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
public class Fila {
    public static void main(String[] args) {
        Queue<Node> fila = new LinkedList<>();

        Node elemento1 = new Node("Bernardo");
        Node elemento2 = new Node("Daniele");
        Node elemento3 = new Node("Marcelo");

        fila.add(elemento1);
        fila.add(elemento2);
        fila.add(elemento3);

        System.out.println("Elementos na fila: " + fila);

        Node proximo = fila.peek();
        System.out.println("Próximo elemento na fila: " + proximo.getData());

        Node novoNo = new Node("Jiani");
        fila.add(novoNo);

        System.out.println("Att fila:  " + fila);

        Node elementoRemovido = fila.remove();
        System.out.println("Elemento removido da fila: " + elementoRemovido.getData());

        System.out.println("Elementos restantes na fila: " + fila);
    }
}
