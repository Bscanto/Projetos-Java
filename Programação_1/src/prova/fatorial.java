package prova;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class fatorial {
    
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
      int fatorial = 1, num; 
      
            System.out.println(" Digite um Valor ");
            num = s.nextInt();
   
      for (int i = 1; i <= num; i++) { 
              fatorial *= i;
               System.out.println("Fatorial de "+i+ " = " +fatorial); 
       } 
    } 
}

