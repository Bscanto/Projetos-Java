package Aula10;

/**
 ▪ Criar uma função que retorna o mínimo de um vetor
 ▪ Criar uma função que recebe 2 vetores e usa a função acima para retornar a soma dos mínimos dos vetores
 ▪ Criar uma função que recebe 3 vetores e calcula a média entre os mínimos de cada vetor
    (use a 1ª função)
 */
public class Atividade4 {
    static int minimo(int vet[]){
        int min = 1000;
         for(int i = 0; i < vet.length; i++){
           if(vet[i] < min){
               min = vet[i];    
           }
         }
            return min;
            
    }
    static int Soma_dos_minimos(int v1[], int v2[]){
        
        return minimo(v1) + minimo(v2);
    }
    
    static int media(int vetor1[], int vetor2[],int vetor3[]){
        
        return ((minimo(vetor1) + minimo(vetor2) + minimo(vetor3)) /3);
        
    }

    public static void main(String[] args) {
      int vetor1 [] = {3,6,5,9};
      int vetor2 [] = {5,2};  
      int vetor3 [] = {2,6,3,8};
      
        System.out.println("O minimo vetor é:");
        System.out.println(minimo(vetor1));
        
        System.out.println("Soma dos minimos: ");
        System.out.println(Soma_dos_minimos(vetor1, vetor2));
        
        System.out.println("A média é:");
        System.out.println(media(vetor1, vetor2, vetor3));
    } 
  }