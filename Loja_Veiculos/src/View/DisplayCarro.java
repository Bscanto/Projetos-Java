package View;

/**
 *
 * @author bruno
 */
import enumeracao.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import veiculo.Veiculo;

public class DisplayCarro implements Creatable{		
	
	public void criarVeiculo(Veiculo veiculo){		
		String chassi, modelo;
		Montadora montadora;
		Cor cor;
		TipoCarro tipoCarro;
		Cambio cambio;
		float motorizacao, preco;
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Entre com o chassi: ");
			chassi = input.nextLine();
			veiculo.setChassi(chassi);
			System.out.println("Entre com uma montadora: BMW - RENAULT - CHEVROLET - FIAT - HYUNDAI ");
			montadora = Montadora.valueOf(verificar(Montadora.class, input.nextLine()));
			veiculo.setEspecificacao("Montadora", montadora);
			System.out.println("Entre com o modelo: ");
			modelo = input.nextLine();
			veiculo.setEspecificacao("Modelo", modelo);
			System.out.println("Entre com um tipo: PICAPE - CONVERSIVEL - ESPORTIVO - PERUA");		
			tipoCarro = TipoCarro.valueOf(verificar(TipoCarro.class, input.nextLine()));
			veiculo.setEspecificacao("Tipo", tipoCarro);
			System.out.println("Entre com uma cor: BRANCO - PRATA - PRETO - VERMELHO");
			cor = Cor.valueOf(verificar(Cor.class, input.nextLine()));
			veiculo.setEspecificacao("Cor", cor);
			System.out.println("Entre com a motorizacao: ");
			motorizacao = input.nextFloat();
			input.nextLine();
			veiculo.setEspecificacao("Motorizacao", motorizacao);
			System.out.println("Entre com um cambio: AUTOMATICO - MANUAL");
			cambio = Cambio.valueOf(verificar(Cambio.class, input.nextLine()));		
			veiculo.setEspecificacao("Cambio", cambio);		
			System.out.println("Entre com o preco: ");
			preco = input.nextFloat();
			veiculo.setPreco(preco);
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.exit(0);
		}
		catch(Exception e){
			e.printStackTrace();
			System.err.print("Incorrect input");
			System.exit(0);
		}
		finally{
			input.close();
		}
	}	
	
	//Verifica se os dados passados pelo usuario constam no Enum
	//Caso nao esteja contido no enum ele gera uma menssagem de erro abortando o sistema	
	private <T extends Enum<T>> String verificar(Class<T> enumClass, String input){		
		
		for(Enum<T> item : enumClass.getEnumConstants())		
			if(item.name().equalsIgnoreCase(input))
				return item.toString();
		
		System.err.println("Does not check");
		System.exit(0);
		return null;
	}	
}
