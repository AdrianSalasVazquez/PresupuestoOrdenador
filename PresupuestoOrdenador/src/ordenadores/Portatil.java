package ordenadores;

import componentes.*;

public class Portatil extends Ordenador{

	private String marca;
	private String modelo;
	private int numUSB;
	private boolean ethernet;
	private Bateria bateria;
	
	public Portatil(PlacaBase placaBase, Procesador procesador, DiscoDuro discoDuro, Ventilacion ventilacion,
			MemoriaRam memRam, String marca, String modelo, int numUSB, boolean ethernet, Bateria bateria) {
		super(placaBase, procesador, discoDuro, ventilacion, memRam);
		this.marca = marca;
		this.modelo = modelo;
		this.numUSB = numUSB;
		this.ethernet = ethernet;
		this.bateria = bateria;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the numUSB
	 */
	public int getNumUSB() {
		return numUSB;
	}

	/**
	 * @param numUSB the numUSB to set
	 */
	public void setNumUSB(int numUSB) {
		this.numUSB = numUSB;
	}

	/**
	 * @return the ethernet
	 */
	public boolean isEthernet() {
		return ethernet;
	}

	/**
	 * @param ethernet the ethernet to set
	 */
	public void setEthernet(boolean ethernet) {
		this.ethernet = ethernet;
	}

	/**
	 * @return the bateria
	 */
	public Bateria getBateria() {
		return bateria;
	}

	/**
	 * @param bateria the bateria to set
	 */
	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	
	@Override
	public String toString() {
		return null;
	}

}
