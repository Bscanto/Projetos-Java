package principal;

/**
 *
 * @author bruno
 */

import enumeracao.*;
import loja.Loja;
import veiculo.Veiculo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner scanner = new Scanner(System.in);

        // Cria um veículo e adiciona ao estoque
        Veiculo veiculo1 = new Veiculo();
        System.out.println("Preencha os detalhes do veículo 1:");
        preencherDetalhesVeiculo(scanner, veiculo1);
        loja.adicionarVeiculo(veiculo1);

        // Cria um veículo e adiciona ao estoque
        Veiculo veiculo2 = new Veiculo();
        System.out.println("Preencha os detalhes do veículo 2:");
        preencherDetalhesVeiculo(scanner, veiculo2);
        loja.adicionarVeiculo(veiculo2);

      

        scanner.close();
    }

    public static void preencherDetalhesVeiculo(Scanner scanner, Veiculo veiculo) {
        System.out.print("Tipo de Veículo (CARRO/MOTOCICLETA): ");
        String tipoVeiculo = scanner.nextLine();
        veiculo.setTipoVeiculo(TipoVeiculo.valueOf(tipoVeiculo));

        System.out.print("Chassi: ");
        String chassi = scanner.nextLine();
        veiculo.setChassi(chassi);

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        veiculo.setPreco((float) preco);

        scanner.nextLine(); // Consome o caractere de nova linha deixado pelo nextDouble()

        System.out.print("Montadora: ");
        String montadora = scanner.nextLine();
        veiculo.setEspecificacao("Montadora", montadora);

        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        veiculo.setEspecificacao("Tipo", tipo);

        // Continue lendo e definindo outras especificações conforme necessário
    }
}

