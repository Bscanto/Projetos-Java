package Aula03_Get_ccarros;

class Carro { //Classe Carro
    String marca;
    String modelo;
    String placa;

    Carro(String marca, String modelo, String placa) { // construtor Carro
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
}

class Pessoa { // classe Pessoa
    String nome;
    int idade;
    int quantidadeCarros = 0;
    Carro c1;// pode ter um carro
    Carro c2; // pode ter 2 carro

    Pessoa(String nome, int idade) { // construtor Pessoa
        this.nome = nome;
        this.idade = idade;
        c1 = null;
        c2 = null;
    }

    void registrarCarro(Carro novo_carro) { // metodo 
        if (c1 == null) {
            c1 = novo_carro;
        } else if (c2 == null) {
            c2 = novo_carro;
        } else {
            System.out.println("Pessoa nao tem carros.");
        }
    }

    int getQuantidadeCarros() {
        if (c1 == null) {
            System.out.println("Não tem carro registrado!");
            return 0;
        } else if (c2 == null) {
            System.out.println("Tem 1 carro");
            return 1;
        } else {
            System.out.println("Tem 2 carros.");
            return 2;
        }
    }

    void remover_ultimo() {
       if (c2 != null ) {
            c2 = null;
            System.out.println("Carro removido com sucesso!");
        } else if (c1 != null) {
            c1 = null;
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro nao encontrado na colecao!");
        }
    }
     void remover_primeiro() {
       if (c2 == null ) {
            c2 = null;
            System.out.println("Carro removido com sucesso!");
        } else if (c1 != null) {
            c1 = null;
            System.out.println("Carro removido com sucesso!");
        } else {
            System.out.println("Carro nao encontrado na colecao!");
        }
     }
}

public class get_carros {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Daniele", 30);
        Pessoa pessoa2 = new Pessoa("Bruno", 32);
        Pessoa pessoa3 = new Pessoa("Fabio", 35);

        Carro carro1 = new Carro("Fiat", "Uno", "ABC-1234");
        Carro carro2 = new Carro("Chevrolet", "Onix", "DEF-5678");
        Carro carro3 = new Carro("Volkswagen", "Gol", "GHI-9101");
        Carro carro4 = new Carro("ferrari", "F200", "JKL-3456");
        Carro carro5 = new Carro("Ford", "Ka", "HSE-5746");
        Carro carro6 = new Carro("Tesla", "T1000", "IAF-6542");

        pessoa1.registrarCarro(carro1);
        pessoa2.registrarCarro(carro2);
        pessoa2.registrarCarro(carro3);
        pessoa3.registrarCarro(carro4);
        pessoa2.registrarCarro(carro5);
        
        pessoa1.getQuantidadeCarros();
        pessoa2.getQuantidadeCarros();
        pessoa3.getQuantidadeCarros();

        
       pessoa2.remover_ultimo();
       
        pessoa1.getQuantidadeCarros();
        pessoa2.getQuantidadeCarros();
        pessoa3.getQuantidadeCarros();
      
    }
}
