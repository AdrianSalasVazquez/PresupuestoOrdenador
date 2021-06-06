package componentes;

public class Componente {

	private String marca;
	private String modelo;
	private double precio;
	
	public Componente(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	/**
	 * Devuelve la marca del componente
	 * @return String marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Modifica la marca del componente
	 * @param
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve el modelo del componente
	 * @return String modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Modifica el modelo del componente
	 * @param
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Devuelve el precio del componente
	 * @return double precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio del componente
	 * @param
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * Devuelve el nombre del componente (marca + modelo)
	 * @return String
	 */
	public String getNombre() {
		return getMarca() + " " + getModelo();
	}
	
	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return getMarca() + " " + getModelo() + " " + getPrecio();
	}
	
}
