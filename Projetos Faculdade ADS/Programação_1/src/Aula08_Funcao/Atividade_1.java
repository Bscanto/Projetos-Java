package Aula08_Funcao;

/**
 ▪ Criar uma função que recebe 3 notas (números com vírgula)
    e retorna a media aritmética delas.
▪ Modifique a função para retornar a media harmônica.

 */
import java.util.Scanner;
public class Atividade_1 {
    static double Calcular_Media (double nota1, double nota2, double nota3){
       return ((nota1 + nota2 + nota3) / 3);
}      
    static double harmonica (double nota1, double nota2, double nota3){
       return (3 / ((1/nota1)+(1/nota2)+(1/nota3)));
}   
    
        public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            
          System.out.println(" Digite a 1° nota : ");
          double nota1 = s.nextDouble();
            
          System.out.println(" Digite a 2° nota : ");
          double nota2 = s.nextDouble();
          
          System.out.println(" Digite a 3° nota : ");
          double nota3 = s.nextDouble();
          
          double media = Calcular_Media(nota1, nota2, nota3);
          double media_harmonica =  harmonica(nota1, nota2, nota3);
          
          System.out.println(" A média aritimética das notas é: " + media);
          System.out.println(" A média Harmônica é: "  + media_harmonica );
            
          if(media < 7)
                System.out.println("Reprovado");
          else if ( media >= 7)
                System.out.println("Aprovado");
        
            
        }
}
