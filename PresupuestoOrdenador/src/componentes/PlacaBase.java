package componentes;

public class PlacaBase extends Componente{

	private String socket;
	private int numPCI;
	private String factorForma;
	
	public PlacaBase(String marca, String modelo, String socket, int numPCI, String factorForma , double precio) {
		super(marca, modelo, precio);
		this.socket = socket;
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
		return super.toString() + " " + getSocket() + " " + getNumPCI() + " " + getFactorForma();
	}

}
