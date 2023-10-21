package Aula02_Paradigma_orientado_objeto;
/*
Implemente a classe Pessoa seguindo os seguintes critérios:
 * A classe Pessoa deve possuir 2 construtores distintos
 * Implementar que a pessoa possa armazenar um ponteiro para seu pai(do tipo pessoa)
 * faça que cada Pesso possa ter até 2 carros
 * implemente o método registrarCarro (Carro c1)

*/

class Carro { //Classe Carro
    String marca;
    String modelo;
    String placa;
    boolean vel_max;
    
    Carro(String marca, String modelo, String placa) { // construtor Carro
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
}
class Pessoa {  // Classe Pessoa
    String nome;
    int idade;
    Pessoa pai;
    Carro[] carros = new Carro[2];
    int numCarros = 0;
    
    Pessoa(String nome, int idade) { // Construtor 1 classe Pessoa
        this.nome = nome;
        this.idade = idade;
    }
    
    Pessoa(String nome, int idade, Pessoa pai) { // Construtor 2 classe Pessoa
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
    }
  void registrarCarro(Carro novo_carro){
       if (numCarros < 2) {
            carros[numCarros] = novo_carro;
            numCarros++;
            System.out.println("\nCarro registrado para " + nome);
        } else {
            System.out.println(nome + " nao pode registrar mais do que 2 carros.");
        }
  }
  }
public class Pessoa_carros {
    public static void main(String[] args) {
        // Criação dos objetos Carros
        Carro carro1 = new Carro("Fiat", "Uno", "ABC-1234");
        Carro carro2 = new Carro("Chevrolet", "Onix", "DEF-5678");
        Carro carro3 = new Carro("Volkswagen", "Gol", "GHI-9012");
        Carro carro4 = new Carro("ferrari", "F200", "JKL-3456");
        Carro carro5 = new Carro("Ford", "Ka", "HSE-5746");
        Carro carro6 = new Carro("Tesla", "T1000", "IAF-6542");
        
        // Registrando nome e idade Pai 1
        Pessoa pai1 = new Pessoa("Bernardo", 50); 
        System.out.println("Nome Pessoa pai: " + pai1.nome);
        // Registrando nome idade pessoa 1
        Pessoa p1 = new Pessoa("Brenda", 25, pai1); 
        System.out.println("Nome pessoa filho: " + p1.nome + ", Filha de: " + pai1.nome);
        
        // registrando carro 1 para Pessoa 1
        p1.registrarCarro(carro1);  
        System.out.println("Carro " + carro1.marca + " " + carro1.modelo + " " + carro1.placa + " registrado para " + p1.nome);
        // registrando carro 2 para Pessoa 1
        p1.registrarCarro(carro2);  
        System.out.println("Carro " + carro2.marca + " " + carro2.modelo + " " + carro2.placa + " registrado para " + p1.nome);
        // Tentando regisatrar um 3 carro para brenda?
        p1.registrarCarro(carro3); 
        
        
        System.out.println("");
        
        // Registrando nome e idade Pai 2
        Pessoa pai2 = new Pessoa("Paulo", 48);
        System.out.println("Nome Pessoa pai: " + pai2.nome);
        // Registrando nome idade pessoa 2
        Pessoa p2 = new Pessoa("Gabriel", 27, pai2); 
        System.out.println("Nome pessoa filho: " + p2.nome + ", Filha de: " + pai2.nome);
        
        //registrando carro 4 para Pessoa 2
        p2.registrarCarro(carro4); 
        System.out.println("Carro " + carro4.marca + " " + carro4.modelo + " " + carro4.placa + " registrado para " + p2.nome);
        //registrando carro 5 para Pessoa 2
        p2.registrarCarro(carro5); 
        System.out.println("Carro " + carro5.marca + " " + carro5.modelo + " " + carro5.placa + " registrado para " + p2.nome);
        // Tentando regisatrar um 3 carro para Gabriel?
        p2.registrarCarro(carro6);
    }
}