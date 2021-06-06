package componentes;

public class Caja extends Componente {
	String factorForma;
	int numUsb;
	int numHdd;
	int numSsd;
	int numPci;
	String material;
	double peso;
	
	public Caja(String marca, String modelo, double precio, String factorForma, int numUsb, int numHdd, int numSsd, int numPci, String material, double peso) {
		super(marca, modelo, precio);
		this.factorForma = factorForma;
		this.numUsb = numUsb;
		this.numHdd = numHdd;
		this.numSsd = numSsd;
		this.numPci = numPci;
		this.material = material;
		this.peso = peso;
	}

	/**
	 * Devuelve el factor forma de la caja
	 * @return String factorForma
	 */
	public String getFactorForma() {
		return factorForma;
	}

	/**
	 * Modifica el factor forma de la caja
	 * @param
	 */
	public void setFactorForma(String factorForma) {
		this.factorForma = factorForma;
	}
	
	/**
	 * Devuelve el numero de USB de la caja
	 * @return int numUSB
	 */
	public int getNumUsb() {
		return numUsb;
	}

	/**
	 * Modifica el numero de USB de la caja
	 * @param
	 */
	public void setNumUsb(int numUsb) {
		this.numUsb = numUsb;
	}

	/**
	 * Devuelve el numero de HDD de la caja
	 * @return int numHDD
	 */
	public int getNumHdd() {
		return numHdd;
	}

	/**
	 * Modifica el numero de HDD de la caja
	 * @param
	 */
	public void setNumHdd(int numHdd) {
		this.numHdd = numHdd;
	}

	/**
	 * Devuelve el numero de SSD de la caja
	 * @return int numSSD
	 */
	public int getNumSsd() {
		return numSsd;
	}

	/**
	 * Modifica el numero de SSD de la caja
	 * @param
	 */
	public void setNumSsd(int numSsd) {
		this.numSsd = numSsd;
	}

	/**
	 * Devuelve el numero de PCI de la caja
	 * @return int numPCI
	 */
	public int getNumPci() {
		return numPci;
	}

	/**
	 * Modifica el numero de PCI de la caja
	 * @param
	 */
	public void setNumPci(int numPci) {
		this.numPci = numPci;
	}

	/**
	 * Devuelve el material de la caja
	 * @return String material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Modifica el material de la caja
	 * @param
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Devuelve el peso de la caja
	 * @return double precio
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Modifica el peso de la caja
	 * @param
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getNumUsb() + " " + getNumHdd() + " " + getNumPci() + " " + getMaterial() + " " + getPeso();
	}
	
}
