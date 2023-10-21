
package Aula06_Herança;

class Pessoa {
    String nome;
    int idade;
    String sexo;

    Pessoa(){
    }
    
    // construtor
    Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    public String toString() {
        return "Nome: " + nome + "- idade: " + idade + "sexo: " + sexo;
    }
}

class Professor extends Pessoa{
String N_docent;
String formacao;
}

public class Aula6 {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.nome = "Bernardo";
        prof1.sexo = "M";
        prof1.N_docent =  "1";
        prof1.formacao= "Ciencia da Computação";
        
        System.out.println(prof1);
    }
}
