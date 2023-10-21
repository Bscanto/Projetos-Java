
package Aula10_TimerTask;

import java.util.Timer;


class Prog2 {
    
    public static void main(String[] args) {
 Timer timer = new Timer();
 long segundos = 5;
 timer.schedule(new TarefaProg(), segundos*1000);
 }
}
