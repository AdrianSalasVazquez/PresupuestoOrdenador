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

	public String getFactorForma() {
		return factorForma;
	}

	public void setFactorForma(String factorForma) {
		this.factorForma = factorForma;
	}

	public int getNumUsb() {
		return numUsb;
	}

	public void setNumUsb(int numUsb) {
		this.numUsb = numUsb;
	}

	public int getNumHdd() {
		return numHdd;
	}

	public void setNumHdd(int numHdd) {
		this.numHdd = numHdd;
	}

	public int getNumSsd() {
		return numSsd;
	}

	public void setNumSsd(int numSsd) {
		this.numSsd = numSsd;
	}

	public int getNumPci() {
		return numPci;
	}

	public void setNumPci(int numPci) {
		this.numPci = numPci;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getNumUsb() + " " + getNumHdd() + " " + getNumPci() + " " + getMaterial() + " " + getPeso();
	}
	
}
