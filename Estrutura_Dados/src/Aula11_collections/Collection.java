
package Aula11_collections;

import java.util.HashSet;
import java.util.LinkedList;



public class Collection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> lista = new LinkedList<>();
        
        for (int i = 0; i < 10000; i++) {
            set.add(i);
            lista.add(i);
        }
        
        long IniciotimeSt = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            set.contains(i);
        }
        long endTimeSet = System.currentTimeMillis();
        long tempoSet = endTimeSet - IniciotimeSt;
        
        long startTimeLista = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            lista.contains(i);
        }
        long endTimeLista = System.currentTimeMillis();
        long tempoLista = endTimeLista - startTimeLista;
       
        System.out.println("Tempo para consultar elementos no Set: " + tempoSet + " ms");
        System.out.println("Tempo para consultar elementos na Lista: " + tempoLista + " ms");
    }
}