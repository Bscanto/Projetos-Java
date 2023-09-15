package Aula08_Funcao;

public class ProgramaçãoAula8 {

    static double somar(double n1, double n2, double n3){
        System.out.println(" Minha função.");
        double somatorio = n1+ n2 + n3;
        return somatorio;
              
           }
       public static void main(String[] args) {
           
          double somar = somar (3.5, 4.6, 7.9);
          for (int i = 0; i<5; i++)
           System.out.println(" Soma: "+ somar);
           }
               
    }
