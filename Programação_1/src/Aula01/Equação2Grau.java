package Aula01;

import java.util.Scanner;

public class Equação2Grau {
   /*
    Implementar um programa que lê os coeficientes de uma função de 2º grau:
    ▪ 𝑎𝑥² + 𝑏𝑥 + 𝑐 = 0

    
    */
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
	
		double a;
		double b;
		double c;
		double delta;
		double x1;
		double x2;
	System.out.println("Escreva o valor de A:");
        a = s.nextDouble();
	System.out.println("Escreva o valor de B:");
        b = s.nextDouble();
	System.out.print("Escreva o valor de C:");
        c = s.nextDouble();
        
	delta = ((b*b)-(4*a*c));
        x1 = 0;
	x2 = 0;
        
	
        if (delta >= 0){
            
	x1 = (  ( -b + (Math.sqrt (delta) )  )  / ( 2*a ) );
	x2 = (  ( -b + (Math.sqrt (delta) )  )  / ( 2*a ) );
        
	System.out.printf("x1 vale: "+ x1);
	System.out.println("");
	System.out.printf("x2 vale: "+ x2);
	System.out.println("");
			}
		
	else//senão(se o delta não for maior nem igual a zero) não podemos resolver.
			{
	System.out.println("Delta invalido");
          }
    }
    
}
