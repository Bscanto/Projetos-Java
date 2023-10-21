
package Aula11_JavaExceptions;
// Definição da exceção SaldoInsuficienteException
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente.");
    }
}

// Definição da exceção SaqueNegativoException
class SaqueNegativoException extends Exception {
    public SaqueNegativoException() {
        super("Não é possível sacar um valor negativo.");
    }
}

// Classe Conta
class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException, SaqueNegativoException {
        if (valor < 0) {
            throw new SaqueNegativoException();
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }

        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    }
}

// Exemplo de uso da classe Conta
public class ContaSaldo {
    public static void main(String[] args) {
        Conta conta = new Conta(100.0);

        try {
            conta.sacar(50.0); // Saque válido
            conta.sacar(-10.0); // Tentativa de sacar um valor negativo
            conta.sacar(110.0); // Tentativa de sacar um valor maior que o saldo
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SaqueNegativoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
