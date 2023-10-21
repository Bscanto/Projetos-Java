package Aula06_Trabalho;
/*
Implemente a classe pai "Funcionario" e as classes filhas Vendedor, Consultor e Gerente.
*/
 class Funcionario {
    String nome;
    int rg;

    Funcionario(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }
}

class Vendedor extends Funcionario {
   int numeroVendas;
   double comissao;

    Vendedor(String nome, int rg, int numeroVendas, double comissao) {
        super(nome, rg);
        this.numeroVendas = numeroVendas;
        this.comissao = comissao;
    }
    void apresentar(){
        System.out.println("Nome: " + nome + " RG: " + rg + " Numero de vendas: " + numeroVendas + " Comissao: " + comissao);
    }
}

class Consultor extends Funcionario {
    double valorHora;
    double horasTrabalhadas;

    Consultor(String nome, int rg, double valorHora, double horasTrabalhadas) {
        super(nome, rg);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    void apresentar(){
        System.out.println("Nome: " + nome + " RG: " + rg + " Valor hora: " + valorHora + " Horas trabalhadas: " + horasTrabalhadas);
    }
}

class Gerente extends Funcionario {
    double bonificacao;

    Gerente(String nome, int rg, double bonificacao) {
        super(nome, rg);
        this.bonificacao = bonificacao;
    }
    
    void apresentar(){
        System.out.println("Nome: " + nome + " RG: " + rg  + " Bonificaçao: " + bonificacao);
    }
}
public class Aula6_Funcionario {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Bernardo", 796258436, 10, 0.5);
        Vendedor vendedor2 = new Vendedor("Daniel", 875425699, 8, 0.8);
        
        Consultor consultor1 = new Consultor("Maria", 778546552, 100.0, 8.0);
        Consultor consultor2 = new Consultor("Marcelo", 876425456, 120, 20);
        
        Gerente gerente1 = new Gerente("Cezar", 345679858, 2000.0);
        Gerente gerente2 = new Gerente("Jose", 974685265, 4000.0);

        System.out.println("===========Vendedor:===========");
        vendedor1.apresentar();
        vendedor2.apresentar();
        System.out.println("");

        System.out.println("===========Consultor:===========");
        consultor1.apresentar();
        consultor2.apresentar();
        System.out.println("");

        System.out.println("===========Gerente:===========");
        gerente1.apresentar();
        gerente2.apresentar();
        
    }
}