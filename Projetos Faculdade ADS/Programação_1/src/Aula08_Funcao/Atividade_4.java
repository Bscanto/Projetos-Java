package Aula08_Funcao;
import java.util.Scanner;

/**
▪ Criar uma função que recebe 1 número como parâmetro, e mostra a tabuada deste
número
▪ Bônus: utilize um loop para chamar a tabuada de 1~10
 */
public class Atividade_4 {

    static int tabuada (int entrada, int multiplicador){
       for (int x = 0; x < 10; x++) {
       }
        return entrada * ++ multiplicador;
     }
    public static void main(String[] args) {
            Scanner s = new Scanner (System.in);
            
          int multiplicador = 0;
          int total = 0;
          int tabelaTabuada = 0;
              
                 System.out.println(" Informe um número: ");
                 int entrada = s.nextInt();

                 for (int x = 0; x < 10; x++) {
                    total = tabuada ( entrada, multiplicador);
                    
                  System.out.println(entrada + " x " + ++multiplicador + " = " + total);
                 }
                 
                     for ( int i =0; i<=10; i++){
                       System.out.println(" \n Tabuada do "+ i + "\n");
        
                       for (int j=1;j<=10;j++){
                       System.out.println( i + " x " + j + " = " + (i * j));
                       
                       
                       }
                     }
    }
}