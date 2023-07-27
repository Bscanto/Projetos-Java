
package Aula11_Exercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
▪ MDC (Máximo Divisor Comum)
▪ O mdc de dois números inteiros x e y pode ser calculado através da seguinte definição
        recursiva:
▪ MDC(x, y) = MDC(x - y, y), se x > y
▪ MDC(x, y) = MDC(y, x), se y > x
▪ MDC(x, y) = x, se x == y
▪ Exemplo: MDC(50, 40)
        Output: 10

 */
public class Atividade4 {
   public static int mdc(int x, int y){
     if(y == 0){
      return x;
    }
    else{
      return mdc(y, x % y); 
    }
  }
   public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
     
   System.out.print("Informe o primeiro inteiro: ");
    int a = entrada.nextInt();
    
    System.out.print("Informe o segundo inteiro: ");
    int b = entrada.nextInt();
     
    System.out.print("O MDC dos valores " + a + " e " +
      b + " é " + mdc(a, b));
          System.out.println("/n");
   } 
}
