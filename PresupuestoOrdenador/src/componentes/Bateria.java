package componentes;

public class Bateria extends Componente {
	double voltaje;
	String tipoPila;
	int carga;
	
	public Bateria(String marca, String modelo, double precio, double voltaje, String tipoPila, int carga) {
		super(marca, modelo, precio);
		this.voltaje = voltaje;
		this.tipoPila = tipoPila;
		this.carga = carga;
	}

	/**
	 * Devuelve el voltaje de la bateria
	 * @return double voltaje
	 */
	public double getVoltaje() {
		return voltaje;
	}

	/**
	 * Modifica el voltaje de la bateria
	 * @param
	 */
	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	/**
	 * Devuelve el tipo de la pila
	 * @return String tipoPila
	 */
	public String getTipoPila() {
		return tipoPila;
	}

	/**
	 * Modifica el tipo de la pila
	 * @param
	 */
	public void setTipoPila(String tipoPila) {
		this.tipoPila = tipoPila;
	}

	/**
	 * Devuelve la carga de la bateria
	 * @return int carga
	 */
	public int getCarga() {
		return carga;
	}

	/**
	 * Modifica la carga de la bateria
	 * @param
	 */
	public void setCarga(int carga) {
		this.carga = carga;
	}

	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getVoltaje() + " " + getTipoPila() + " " + getCarga();
	}
	
	
}
