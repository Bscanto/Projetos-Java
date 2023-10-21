package Aula03;

class Pessoa{ //classe pessoa
    private String nome;
    private int idade;
    
    
    Pessoa(String nome){ // construtor pessoa
        this.nome = nome;
        idade = 19;
    }
    private void fazer_aniversario(){ //metodo pessoa
        idade++;
    }
    String getNome(){
        return nome;
    }
    void setNome(String novoNome){
        this.nome = novoNome;
    }
}

class Conta{
    Pessoa dono;
    private double saldo;
    
    
    Conta(Pessoa dono){
        this.dono = dono;
        saldo = 0;
    }
    double get_saldo(){
        return saldo;
    }
    void depositar(double deposito){
        saldo = saldo + deposito;
    }
    boolean sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo indispon�vel");
            return false;
        }
        saldo -= valor;
        return true;
    }
}

public class Aula3_Conta_sacar_depositar {
      public static void main(String[] args) {
          
        Pessoa p1 = new Pessoa("Bernardo");//criar pessoa p1
        
        System.out.println(p1.getNome());// imprime nome Bernardo
        
        p1.setNome("Carlos");
        System.out.println(p1.getNome());
        
        Conta c1 = new Conta(p1);// criar conta pessoa p1
        
        c1.depositar(200); // depositar conta c1 de p1
        System.out.println(c1.sacar(100));//sacar conta c1 de p1 
        
        System.out.println("O saldo de c1 �: "+c1.get_saldo());// saldo conta c1
    }
}