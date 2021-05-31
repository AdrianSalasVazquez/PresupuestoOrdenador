package componentes;

public class PlacaBase extends Componente{

	private String socket;
	private int maxRAM;
	private String tipoRAM;
	private int numPCI;
	private String factorForma;
	
	public PlacaBase(String marca, String modelo, String socket, int maxRAM, String tipoRAM, int numPCI, String factorForma , double precio) {
		super(marca, modelo, precio);
		this.socket = socket;
		this.maxRAM = maxRAM;
		this.tipoRAM = tipoRAM;
		this.numPCI = numPCI;
		this.factorForma = factorForma;
		
	}

	
	
	/**
	 * @return the socket
	 */
	public String getSocket() {
		return socket;
	}



	/**
	 * @param socket the socket to set
	 */
	public void setSocket(String socket) {
		this.socket = socket;
	}



	/**
	 * @return the maxRAM
	 */
	public int getMaxRAM() {
		return maxRAM;
	}



	/**
	 * @param maxRAM the maxRAM to set
	 */
	public void setMaxRAM(int maxRAM) {
		this.maxRAM = maxRAM;
	}



	/**
	 * @return the tipoRAM
	 */
	public String getTipoRAM() {
		return tipoRAM;
	}



	/**
	 * @param tipoRAM the tipoRAM to set
	 */
	public void setTipoRAM(String tipoRAM) {
		this.tipoRAM = tipoRAM;
	}



	/**
	 * @return the numPCI
	 */
	public int getNumPCI() {
		return numPCI;
	}



	/**
	 * @param numPCI the numPCI to set
	 */
	public void setNumPCI(int numPCI) {
		this.numPCI = numPCI;
	}



	/**
	 * @return the factorForma
	 */
	public String getFactorForma() {
		return factorForma;
	}



	/**
	 * @param factorForma the factorForma to set
	 */
	public void setFactorForma(String factorForma) {
		this.factorForma = factorForma;
	}



	@Override
	public String toString() {
		return null;
	}

}
