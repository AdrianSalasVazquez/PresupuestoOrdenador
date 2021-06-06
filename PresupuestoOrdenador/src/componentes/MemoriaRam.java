package componentes;

public class MemoriaRam extends Componente {
	int numModulos;
	int tamano;
	String tipoMemoria;
	int velocidad;
	
	public MemoriaRam(String marca, String modelo, double precio, int numModulos, int tamano, String tipoMemoria, int velocidad) {
		super(marca, modelo, precio);
		this.numModulos = numModulos;
		this.tamano = tamano;
		this.tipoMemoria = tipoMemoria;
		this.velocidad = velocidad;
	}

	/**
	 * Devuelve el numero de modulos de la RAM
	 * @return int numModulos
	 */
	public int getNumModulos() {
		return numModulos;
	}

	/**
	 * Modifica el numero de modulos de la RAM
	 * @param
	 */
	public void setNumModulos(int numModulos) {
		this.numModulos = numModulos;
	}

	/**
	 * Devuelve el tamaño de la RAM
	 * @return int tamaño
	 */
	public int getTamano() {
		return tamano;
	}

	/**
	 * Modifica el tamaño de la RAM
	 * @param
	 */
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	/**
	 * Devuelve el tipo de la RAM
	 * @return String tipoMemoria
	 */
	public String getTipoMemoria() {
		return tipoMemoria;
	}

	/**
	 * Modifica el tipo de la RAM
	 * @param
	 */
	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}

	/**
	 * Devuelve la velocidad de la RAM
	 * @return int velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Modifica la velocidad de la RAM
	 * @param
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Devuelve el numero de modulos y su tamaño en un formato (2x8)
	 * @return String resultado
	 */
	public String getModulos() {
		String resultado = getNumModulos() + "x" + getTamano();
		return resultado;
	}

	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getModulos() + " " + getTipoMemoria() + " " + getVelocidad();
	}
	
	
}
