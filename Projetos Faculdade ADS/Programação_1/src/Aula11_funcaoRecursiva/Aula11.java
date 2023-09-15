package prog1_aula11_função_recursiva;

/**
 *
 * @author bruno
 */
public class Aula11 {
static void contar (int i){
    System.out.println(i);
    if(i<100)// inverter a condição (i>100), uma da quando continuar e outra quando parar
        contar(i+1);
    
}
    
    public static void main(String[] args) {
       contar(5);
    }
    
}
