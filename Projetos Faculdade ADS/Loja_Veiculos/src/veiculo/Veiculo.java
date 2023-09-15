package veiculo;

/**
 *
 * @author bruno
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import enumeracao.TipoVeiculo;

public class Veiculo{	
	private TipoVeiculo tipoVeiculo;
	private String chassi;
	private float preco;	
	private Map<String, Object> especificacao;		
	
	public Veiculo(){			
		especificacao = new HashMap<String, Object>();
	}
	
	public TipoVeiculo getTipoVeiculo(){
		return tipoVeiculo;
	}	
	
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo){
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}	
	
	public void setEspecificacao(String key, Object value){
		especificacao.put(key, value);
	}
	
	public Map<String, Object> getEspecificacao(){
		return this.especificacao;
	}
	
}
