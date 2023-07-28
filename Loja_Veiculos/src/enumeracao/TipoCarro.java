
package enumeracao;

/**
 *
 * @author bruno
 */
public enum TipoCarro {
	
	PICAPE(1, "picape"), 
        CONVERSIVEL(2, "conversivel"), 
        ESPORTIVO(3, "esportivo"), 
        PERUA(4, "perua"),
        SEDAN(5, "sedan"), 
        HATCH(6, "hatch"), 
        SUV(7, "suv"),
        MINIVAN(6, "minivan"),;
	
	private int numTipoCarro;
	private String nomeTipoCarro;
	
	public int getNumTipoCarro() {
		return numTipoCarro;
	}

	public void setNumTipoCarro(int numTipoCarro) {
		this.numTipoCarro = numTipoCarro;
	}

	public String getNomeTipoCarro() {
		return nomeTipoCarro;
	}

	public void setNomeTipoCarro(String nomeTipoCarro) {
		this.nomeTipoCarro = nomeTipoCarro;
	}	
	
	private TipoCarro(int numTipoCarro, String nomeTipoCarro){
		this.numTipoCarro = numTipoCarro;
		this.nomeTipoCarro = nomeTipoCarro;		 
	}
}