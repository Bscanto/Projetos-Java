package enumeracao;

/**
 *
 * @author bruno
 */
public enum Montadora {
	
	HONDA(1, "honda"), 
        YAMAHA(2, "yamaha"),
        BMW(3, "bmw"), 
        SUZUKI(4, "suzuki"),
	HARLEY(5, "harley"), 
        RENAULT(6, "renault"),
	CHEVROLET(7, "chevrolet"), 
        FIAT(8, "fiat"),
        FORD(9, "ford"),
        AUDI(10, "Audi"),
	VOLKSWAGEN(11, "Volkswagen"), 
	TOYOTA(12, "toyota"), 
        PORCHE(13, "porche"),
        HYUNDAI(14, "hyundai");
	
	private final int numMontadora;
	private final String nomeMontadora;
	
	private Montadora(int numMontadora, String nomeMontadora){
		this.numMontadora = numMontadora;
		this.nomeMontadora = nomeMontadora;
	}
	
	public int getNumMontadora(){
		return numMontadora;
	}
	public String getNomeMontadora(){
		return nomeMontadora;
	}
}
