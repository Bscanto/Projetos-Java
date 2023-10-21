package Aula06_Trabalho;
/*
Implemente que cada Pessoa pode ter várias Contas.

Crie os métodos:

getNumeroDeContas()
getSaldoTotal()
*/
import java.util.ArrayList;

class Pessoa {
    private String nome;
    private int idade;
    private ArrayList<Conta> contas; 
    
    Pessoa(String nome) {
        this.nome = nome;
        idade = 19;
        contas = new ArrayList<>();
    }
    
    void fazerAniversario() { 
        idade++;
    }
    
    String getNome() {
        return nome;
    }
    
    void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    void adicionarConta(Conta conta) { 
        contas.add(conta);
    }
    
    int getNumeroDeContas() { 
        return contas.size();
    }
    
    double getSaldoTotal() { 
        double saldoTotal = 0;
        for (Conta conta : contas) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }
    
    boolean transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        if (contaOrigem.sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}

class Conta {
    Pessoa dono;
    private double saldo;
    
    Conta(Pessoa dono) {
        this.dono = dono;
        saldo = 0;
    }
    
    double getSaldo() {
        return saldo;
    }
    
    boolean depositar(double deposito) {
        if (deposito <= 0) {
            System.out.println("Valor inválido");
            return false;
        }
        saldo += deposito;
        return true;
    }
    
    boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo indisponível");
            return false;
        }
        saldo -= valor;
        return true;
    }
    
    boolean transferir(Conta contaDestino, double valor) {
        return dono.transferir(this, contaDestino, valor);
    }
}

public class Pessoa_Varias_Contas {
     public static void main(String[] args) {
   Pessoa pessoa = new Pessoa("João");
        Conta conta1 = new Conta(pessoa);
        Conta conta2 = new Conta(pessoa);
        pessoa.adicionarConta(conta1);
        pessoa.adicionarConta(conta2);
        conta1.depositar(100);
        conta2.depositar(200);
        System.out.println("Número de contas: " + pessoa.getNumeroDeContas());
        System.out.println("Saldo total das contas: " + pessoa.getSaldoTotal());
        System.out.println("Transferência de conta 1 para conta 2: " + conta1.transferir(conta2, 50));
        System.out.println("Saldo total das contas após transferência: " + pessoa.getSaldoTotal());
        System.out.println("Saque de 70 da conta 2: " + conta2.sacar(70));
        System.out.println("Saldo total das contas após saque: " + pessoa.getSaldoTotal());
        System.out.println("Depósito de 30 na conta 1: " + conta1.depositar(30));
        System.out.println("Saldo total das contas após depósito: " + pessoa.getSaldoTotal());
    }
}






