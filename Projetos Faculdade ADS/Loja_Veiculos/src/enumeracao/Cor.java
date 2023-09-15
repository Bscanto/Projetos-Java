package enumeracao;

/**
 *
 * @author bruno
 */
public enum Cor {
	
	BRANCO(1, "branco"), PRATA(2, "prata"), PRETO(3, "preto"), VERMELHO(4, "vermelho");
	
	private int numCor;
	private String nomeCor;
	
	private Cor(int numCor, String nomeCor){
		this.numCor = numCor;	
		this.nomeCor = nomeCor;
	}
	public int getCor(){
		return numCor;
	}
	public String getNomeCor(){
		return nomeCor;
	}
}