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
	 * Devuelve el socket de la placa
	 * @return String socket
	 */
	public String getSocket() {
		return socket;
	}

	/**
	 * Modifica el socket de la placa
	 * @param
	 */
	public void setSocket(String socket) {
		this.socket = socket;
	}

	/**
	 * Devuelve el numero de ranuras PCI
	 * @return int numPCI
	 */
	public int getNumPCI() {
		return numPCI;
	}

	/**
	 * Modifica el numero de ranuras PCI
	 * @param
	 */
	public void setNumPCI(int numPCI) {
		this.numPCI = numPCI;
	}

	/**
	 * Devuelve el factor forma de la placa
	 * @return String factorForma
	 */
	public String getFactorForma() {
		return factorForma;
	}

	/**
	 * Modifica el factor forma de la placa
	 * @param
	 */
	public void setFactorForma(String factorForma) {
		this.factorForma = factorForma;
	}
	
	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getSocket() + " " + getNumPCI() + " " + getFactorForma();
	}

}
