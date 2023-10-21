package Aula07_Herança_Continuação;

import java.util.ArrayList;

class Funcionario {
    protected String nome;
    protected int idade;
    protected double salarioBase;
    
    Funcionario(String nome, int idade, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.salarioBase = 1000;
    }

    protected double getSalario() {
        return this.salarioBase;
    }
}

class Vendedor extends Funcionario {
   int numeroVendas;
   double comissao;

    Vendedor(String nome, int idade, double salarioBase, int numeroVendas, double comissao) {
        super(nome, idade, salarioBase);
        this.numeroVendas = numeroVendas;
        this.comissao = comissao;
    }
     public double getSalario(){
     return  super.getSalario() + (numeroVendas * comissao);
 }
    void apresentar(){
        System.out.println("Nome: " + this.nome + " Idade: " + idade + " Numero de vendas: " + numeroVendas + " Comissao: " + comissao);
    }
}

class Consultor extends Funcionario {
    double valorHora;
    double horasTrabalhadas;

    Consultor(String nome, int idade, double salarioBase, double valorHora, double horasTrabalhadas) {
        super(nome, idade, salarioBase);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    protected double getSalario() {
        return this.salarioBase + this.valorHora * this.horasTrabalhadas;
    }

    void apresentar(){
        System.out.println("Nome: " + nome + " Idade: " + idade + " Valor hora: " + valorHora + " Horas trabalhadas: " + horasTrabalhadas);
    }
}

class Gerente extends Funcionario {
    double bonificacao;

    Gerente(String nome, int idade, double salarioBase, double bonificacao) {
        super(nome, idade, salarioBase);
        this.bonificacao = bonificacao;
    }

    protected double getSalario() {
        return this.salarioBase + this.bonificacao;
    }

    void apresentar(){
        System.out.println("Nome: " + nome + " Idade: " + idade  + " Bonificaçao: " + bonificacao);
    }
}

public class Funcionario_super {
     public static void main(String[] args) {
    ArrayList<Funcionario> meus_funcionarios = new ArrayList<Funcionario>();
        Vendedor vendedor1 = new Vendedor("Bernardo",32,1000, 10 ,0.3);
        Vendedor vendedor2 = new Vendedor("Daniel", 87,1000, 8, 0.8);
        
        Consultor consultor1 = new Consultor("Maria", 25, 1000, 10, 8.0);
        Consultor consultor2 = new Consultor("Marcelo", 28,1000,  120, 20);
        
        Gerente gerente1 = new Gerente("Cezar", 34,1000, 2000.0);
        Gerente gerente2 = new Gerente("Jose", 97,1000, 4000.0);

        
        meus_funcionarios.add(new Funcionario("Bernardo", 23, 1000));
         for (int i = 0; i < meus_funcionarios.size(); i++) {
             Funcionario f = meus_funcionarios.get(i);
             System.out.println(f.nome + ": " + f.getSalario());// implementar os outros dados
         }
        
        System.out.println("===========Vendedor:===========");
        vendedor1.apresentar();
        System.out.println("Salário do vendedor: " + vendedor1.getSalario());
        vendedor2.apresentar();
        System.out.println("Salário do vendedor: " + vendedor2.getSalario());
        System.out.println("");

        System.out.println("===========Consultor:===========");
        consultor1.apresentar();
        System.out.println("Salário do vendedor: " + consultor1.getSalario());
        consultor2.apresentar();
        System.out.println("Salário do vendedor: " + consultor2.getSalario());
        System.out.println("");

        System.out.println("===========Gerente:===========");
        gerente1.apresentar();
        System.out.println("Salário do vendedor: " + gerente1.getSalario());
        gerente2.apresentar();
        System.out.println("Salário do vendedor: " + gerente2.getSalario());
        
        
     }    
    }
