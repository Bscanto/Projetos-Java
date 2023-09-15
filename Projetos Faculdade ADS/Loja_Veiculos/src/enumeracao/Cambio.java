package enumeracao;

/**
 *
 * @author bruno
 */
public enum Cambio {
	
	AUTOMATICO(1, "automatico"), MANUAL(2, "manual");
	
	private int numCambio;
	private String nomeCambio;
	
	private Cambio(int numCambio, String nomeCambio){
		this.numCambio = numCambio;
		this.nomeCambio = nomeCambio;
	}
	
	public int getNumCambio(){
		return this.numCambio;
	}
	
	public String getNomeCambio(){
		return this.nomeCambio;
	}
}
