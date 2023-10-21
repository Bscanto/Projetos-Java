
package Aula10_TimerTask;

import java.util.TimerTask;


public class TarefaProg extends TimerTask{
    int ano;
 public TarefaProg() {
 //Podemos inicializar atributos
 ano = 2020;
 }
 @Override
 public void run() {
 System.out.println("Olá turma de programação de "+ano);
 }
}
