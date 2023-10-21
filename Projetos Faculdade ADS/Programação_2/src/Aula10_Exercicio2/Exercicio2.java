
package Aula10_Exercicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/**
 Faça um programa que inicia com uma Fila vazia e a cada 2 segundos adiciona 2 elementos (podem
 ser inteiros).
 */
public class Exercicio2 extends TimerTask {
    
    Queue<Integer> fila;

    @Override
    public void run() {
        if (fila.size() >= 30) {
            System.out.println("Fila cheia");
            cancel(); 
            return;
        }
        fila.add(1) ;
        fila.add(2) ;
        System.out.println("Elementos adicionados. Tamanho atual da fila: " + fila.size());
        
    }

    public static void main(String[] args) {
       
        Queue<Integer> fila = new LinkedList<>();
        Exercicio2 tarefa = new Exercicio2();
        
        tarefa.fila = fila;

        Timer timer = new Timer();
        timer.schedule(tarefa, 0, 2000);
    }
}