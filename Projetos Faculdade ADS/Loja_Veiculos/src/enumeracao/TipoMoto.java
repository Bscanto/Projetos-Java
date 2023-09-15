package enumeracao;

/**
 *
 * @author bruno
 */
public enum TipoMoto {
	
	STREET(1, "street"), 
        CHOPPER(2, "chopper"), 
        SCOOTER(3, "scooter"), 
        CUSTOM(4, "custom"),
        NAKED(5, "naked"),
        TRAIL(6, "trail");
	
	private int numTipoMoto;
	private String nomeTipoMoto;
	
	public int getNumTipoMoto() {
		return numTipoMoto;
	}

	public void setNumTipoMoto(int numTipoMoto) {
		this.numTipoMoto = numTipoMoto;
	}

	public String getNomeTipoMoto() {
		return nomeTipoMoto;
	}

	public void setNomeTipoMoto(String nomeTipoMoto) {
		this.nomeTipoMoto = nomeTipoMoto;
	}	
	
	private TipoMoto(int numTipoMoto, String nomeTipoMoto){
		this.numTipoMoto = numTipoMoto;
		this.nomeTipoMoto = nomeTipoMoto;		 
	}
}
