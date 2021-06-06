package componentes;

public class Procesador extends Componente {

	private int nucleos;
	private int hilos;
	private String velocidad;
	private double consumo;
	
	public Procesador(String marca, String modelo, int nucleos, int hilos, String velocidad, double consumo, double precio) {
		super(marca, modelo, precio);
		this.nucleos = nucleos;
		this.hilos = hilos;
		this.velocidad = velocidad;
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
	 * @return the consumo
	 */
	public double getConsumo() {
		return consumo;
	}



	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}



	@Override
	public String toString() {
		return super.toString() + " " + getNucleos() + " " + getHilos() + " " + getVelocidad() + " " + getConsumo();
	}
	
}
