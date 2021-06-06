package componentes;

public class FuenteAlimentacion extends Componente {
	int potencia;
	String tipoFuente;
	String certificacion;
	
	public FuenteAlimentacion(String marca, String modelo, double precio, int potencia, String tipoFuente, String certificacion) {
		super(marca, modelo, precio);
		this.potencia = potencia;
		this.tipoFuente = tipoFuente;
		this.certificacion = certificacion;
	}

	/**
	 * Devuelve la potencia de la fuente
	 * @return int potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * Modifica la potencia de la fuente
	 * @param
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * Devuelve el tipo de fuente
	 * @return String tipoFuente
	 */
	public String getTipoFuente() {
		return tipoFuente;
	}

	/**
	 * Modifica el tipo de fuente
	 * @param
	 */
	public void setTipoFuente(String tipoFuente) {
		this.tipoFuente = tipoFuente;
	}

	/**
	 * Devuelve la certifficacion de la fuente
	 * @return String certificacion
	 */
	public String getCertificacion() {
		return certificacion;
	}

	/**
	 * Modifica la certificacion de la fuente
	 * @param
	 */
	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getPotencia() + " " + getTipoFuente() + " " + getCertificacion();
	}
	
	
}
