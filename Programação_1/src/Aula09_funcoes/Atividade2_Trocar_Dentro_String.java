package Aula09_funcoes;

/**
 ▪ Criar uma função que recebe 3 parâmetros
▪ String texto
▪ double antes
▪ double depois
▪ Retorna uma String que substitui todos os valores ‘antes’ por ‘depois’
 */
public class Atividade2_Trocar_Dentro_String {
      static void substituir (String texto, int antes, int depois){
       String replaceString = texto.replace("3","4");
       System.out.println(replaceString);
        
    }
    public static void main(String[] args) {
       substituir("Gabriela tem 3 anos de idade",3,4);
        
    }
    
}