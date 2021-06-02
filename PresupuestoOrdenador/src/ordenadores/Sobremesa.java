package ordenadores;

import componentes.*;

public class Sobremesa extends Ordenador {

	private Caja caja;
	private FuenteAlimentacion fuenteAlimentacion;
	private TarjetaGrafica tarjetaGrafica;
	
	public Sobremesa(PlacaBase placaBase, Procesador procesador, DiscoDuro discoDuro, Ventilacion ventilacion,
			MemoriaRam memRam, Caja caja, FuenteAlimentacion fuenteAlimentacion, TarjetaGrafica tarjetaGrafica) {
		super(placaBase, procesador, discoDuro, ventilacion, memRam);
		this.caja = caja;
		this.fuenteAlimentacion = fuenteAlimentacion;
		this.tarjetaGrafica = tarjetaGrafica;
	}

	/**
	 * @return the caja
	 */
	public Caja getCaja() {
		return caja;
	}

	/**
	 * @param caja the caja to set
	 */
	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	/**
	 * @return the fuenteAlimentacion
	 */
	public FuenteAlimentacion getFuenteAlimentacion() {
		return fuenteAlimentacion;
	}

	/**
	 * @param fuenteAlimentacion the fuenteAlimentacion to set
	 */
	public void setFuenteAlimentacion(FuenteAlimentacion fuenteAlimentacion) {
		this.fuenteAlimentacion = fuenteAlimentacion;
	}

	/**
	 * @return the tarjetaGrafica
	 */
	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	/**
	 * @param tarjetaGrafica the tarjetaGrafica to set
	 */
	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	@Override
	public String toString() {
		return null;
	}
	
}
