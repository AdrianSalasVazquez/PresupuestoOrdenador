package componentes;

public class Procesador extends Componente {

	private int nucleos;
	private int hilos;
	private String velocidad;
	private int maxRAM;
	private String tipoRAM;
	private int consumo;
	
	public Procesador(String marca, String modelo, int nucleos, int hilos, String velocidad, int maxRAM, String tipoRAM, int consumo, double precio) {
		super(marca, modelo, precio);
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.velocidad = velocidad;
		this.maxRAM = maxRAM;
		this.tipoRAM = tipoRAM;
		this.consumo = consumo;
	}
	
	

	/**
	 * @return the nucleos
	 */
	public int getNucleos() {
		return nucleos;
	}



	/**
	 * @param nucleos the nucleos to set
	 */
	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}



	/**
	 * @return the hilos
	 */
	public int getHilos() {
		return hilos;
	}



	/**
	 * @param hilos the hilos to set
	 */
	public void setHilos(int hilos) {
		this.hilos = hilos;
	}



	/**
	 * @return the velocidad
	 */
	public String getVelocidad() {
		return velocidad;
	}



	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
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
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}



	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}



	@Override
	public String toString() {
		return super.toString() + " " + getNucleos() + " " + getHilos() + " " + getVelocidad() + " " + getMaxRAM() + " " + getTipoRAM() + " " + getConsumo();
	}
	
}
