package ordenadores;

import componentes.*;

public class Ordenador {
	
	private PlacaBase placaBase;
	private Procesador procesador;
	private DiscoDuro discoDuro;
	private Ventilacion ventilacion;
	private MemoriaRam memRam;
	
	public Ordenador(PlacaBase placaBase, Procesador procesador, DiscoDuro discoDuro, Ventilacion ventilacion, MemoriaRam memRam) {
		this.placaBase = placaBase;
		this.procesador = procesador;
		this.discoDuro = discoDuro;
		this.ventilacion = ventilacion;
		this.memRam = memRam;
	}

	/**
	 * @return the placaBase
	 */
	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	/**
	 * @param placaBase the placaBase to set
	 */
	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	/**
	 * @return the procesador
	 */
	public Procesador getProcesador() {
		return procesador;
	}

	/**
	 * @param procesador the procesador to set
	 */
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	/**
	 * @return the discoDuro
	 */
	public DiscoDuro getDiscoDuro() {
		return discoDuro;
	}

	/**
	 * @param discoDuro the discoDuro to set
	 */
	public void setDiscoDuro(DiscoDuro discoDuro) {
		this.discoDuro = discoDuro;
	}

	/**
	 * @return the ventilacion
	 */
	public Ventilacion getVentilacion() {
		return ventilacion;
	}

	/**
	 * @param ventilacion the ventilacion to set
	 */
	public void setVentilacion(Ventilacion ventilacion) {
		this.ventilacion = ventilacion;
	}

	/**
	 * @return the memRam
	 */
	public MemoriaRam getMemRam() {
		return memRam;
	}

	/**
	 * @param memRam the memRam to set
	 */
	public void setMemRam(MemoriaRam memRam) {
		this.memRam = memRam;
	}
	
	@Override
	public String toString() {
		return null;
	}
	
}
