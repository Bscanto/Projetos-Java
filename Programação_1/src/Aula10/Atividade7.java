package Aula10;
/**
 ▪ Criar uma função que retorna o somatório de um vetor
 ▪ Criar uma função que calcula a média de todos os elementos de um vetor (utilizando a 1ª função)
 ▪ Criar uma função que recebe 2 vetores e retorna true se o somatório do 1º vetor é maior
         que o 2º, ou false caso contrário (utilizando a primeira função
 */
public class Atividade7 {

        static int somatorio(int vet[]){
        int soma = 0;
         for(int i = 0; i < vet.length; i++){
         soma +=  vet[i]; // soma a variavel soma com cada valor dos indices do vetor. 
            }
            return soma;
        }
        
    static double media(int vet[]){
        
        return somatorio(vet) / (double)vet.length;
    }
    
    static boolean maior(int vetor1[], int vetor2[]){
            if(somatorio(vetor1) > somatorio(vetor2))
                
            return true;
            
            else
                return false;
            }
    
    public static void main(String[] args) {
      int vetor1 [] = {3,6,};
      int vetor2 [] = {5,2};  
      
      
        System.out.println("A soma do 1° vetor é:");
        System.out.println(somatorio(vetor1));
        
        System.out.println("A média é: ");
        System.out.println(media(vetor1));
        
        System.out.println("A média é:");
        System.out.println(maior(vetor1, vetor2));
    } 
  }