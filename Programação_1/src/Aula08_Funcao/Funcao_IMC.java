package Aula08_Funcao;

public class Funcao_IMC {
    static double calcular_imc (double peso, double altura){
       //double imc = peso * (altura * altura);
       return peso * (altura * altura);
}       
        public static void main(String[] args) {
            
          double meu_imc = calcular_imc(50, 1.50);
          
            System.out.println(" Meu imc é: " + meu_imc);
         
           }
}
