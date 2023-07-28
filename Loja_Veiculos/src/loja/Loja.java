package loja;

/**
 *
 * @author bruno
 */
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import veiculo.Veiculo;

public class Loja {
	private String endereco;
	private String nome;
	private ArrayList<Veiculo> estoqueVeiculo; 
	
	public Loja(){
		estoqueVeiculo = new ArrayList<Veiculo>();
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Veiculo> getEstoqueVeiculo() {
		return estoqueVeiculo;
	}

	public void setEstoqueVeiculo(Veiculo veiculo) {
		estoqueVeiculo.add(veiculo);		
	}	
	
	public void adicionarVeiculo(Veiculo veiculo){
		this.setEstoqueVeiculo(veiculo);		
	}	
		
	public ArrayList<Veiculo> pesquisarVeiculo(Map<String, Object> mapaDePesquisa){
		ArrayList<Veiculo> resultadoDeVeiculos = new ArrayList<Veiculo>();	
		
		if(this.getEstoqueVeiculo().isEmpty()){
			System.out.println("Nao ha veiculos no estoque");
		}
		else{
			for(Veiculo veiculo : this.getEstoqueVeiculo()){		
				if(veiculo.equals(mapaDePesquisa)){
					resultadoDeVeiculos.add(veiculo);	
				}
			}
		}
		return resultadoDeVeiculos;
	}

	public Veiculo buscarVeiculo(String chassi){
		for(Veiculo veiculo : this.getEstoqueVeiculo()){
			if(veiculo.getChassi().equals(chassi)){
				return veiculo;
			}			
		}
		return null;
	}		
	
	public void listarEstoque(){
		
		if(this.getEstoqueVeiculo().isEmpty()){
			System.out.println("Nao ha veiculos no estoque");
		}
		else{
			for(Veiculo veiculo : this.getEstoqueVeiculo()){
				System.out.println("Tipo de veiculo: " + veiculo.getTipoVeiculo());
				System.out.println("Chassi:"+ veiculo.getChassi());
				System.out.println("Preco:" + veiculo.getPreco());			
				for(Entry<String, Object> entry : veiculo.getEspecificacao().entrySet()){
					System.out.println(entry.getKey() + ": "+ entry.getValue());
				}
				System.out.println();
			}
		}
	}
	
	// Sobrecarga do metodo listarEstoque
	public void listarEstoque(Veiculo veiculo){
		
		if(veiculo != null){			
			System.out.println("Tipo de veiculo: " + veiculo.getTipoVeiculo());
			System.out.println("Chassi:"+ veiculo.getChassi());
			System.out.println("Preco:" + veiculo.getPreco());			
			for(Entry<String, Object> entry : veiculo.getEspecificacao().entrySet()){
				System.out.println(entry.getKey() + ": "+ entry.getValue());				
			}
		}
		else{
			System.out.println("Veiculo nao encontrado");
		}
	}
	
	// Sobrecarga do metodo listarEstoque
	public void listarEstoque(ArrayList<Veiculo> listaDeVeiculo){
		
		if(listaDeVeiculo.isEmpty()){
			System.out.println("Nao ha veiculos no estoque");
		}
		else{
			for(Veiculo veiculo : listaDeVeiculo){				
				System.out.println("Tipo de veiculo: " + veiculo.getTipoVeiculo());
				System.out.println("Chassi:"+ veiculo.getChassi());
				System.out.println("Preco:" + veiculo.getPreco());			
				for(Entry<String, Object> entry : veiculo.getEspecificacao().entrySet()){
					System.out.println(entry.getKey() + ": "+ entry.getValue());
				}
				System.out.println();
			}
		}
	}	
}

