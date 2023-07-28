/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author bruno
 */
import loja.Loja;
import veiculo.Veiculo;
import View.Creatable;
import View.DisplayCarro;
import View.DisplayMoto;

public class Teste {
	
	public static void main(String[]args){
		Loja loja = new Loja();
		
		//Cria uma carro e lista o estoques
		Creatable create1 = new DisplayCarro();		
		Veiculo carro = new Veiculo();		
		create1.criarVeiculo(carro);		
		loja.adicionarVeiculo(carro);		
		loja.listarEstoque();		
		
		//Cria uma moto e lista o estoque
		Creatable create2 = new DisplayMoto();		
		Veiculo moto = new Veiculo();		
		create2.criarVeiculo(moto);		
		loja.adicionarVeiculo(moto);		
		loja.listarEstoque();			
		
	}
}