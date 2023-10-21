package Aula10_Exercicio1;

/**
 Faça um programa que inicia com uma Pilha de cartas, e a cada segundo vai tirando a carta mais de
cima.
 Quando chegar no final da pilha, a TimerTask deve parar de ser chamada
 */

import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

class Exercicio1 extends TimerTask{
    Stack<String> pilha;

    @Override
    public void run() {
         if (!pilha.empty()) {
            System.out.println("Carta removida: " + pilha.pop());
        } else {
            System.out.println("Pilha vazia");
            cancel(); // Para a TimerTask quando a pilha estiver vazia
        }
    }
    
  
   public static void main(String[] args) {
        
        Stack<String> pilha = new Stack<>();
        pilha.push("Ás");
        pilha.push("2");
        pilha.push("3");
        pilha.push("4");
        pilha.push("5");
        pilha.push("6");
        pilha.push("7");
        pilha.push("8");
        pilha.push("9");
        pilha.push("10");
        pilha.push("Valete");
        pilha.push("Rainha");
        pilha.push("Rei");
        
        
        Exercicio1 tarefa = new Exercicio1();
        tarefa.pilha = pilha;

        Timer timer = new Timer();
        timer.schedule(tarefa, 0, 1000);
}
    }

