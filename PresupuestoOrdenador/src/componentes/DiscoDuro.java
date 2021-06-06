package componentes;

public class DiscoDuro extends Componente {
	private String tipoDisco;
	private int capacidad;
	private double consumo;
	
	public DiscoDuro(String marca, String modelo, double precio, String tipoDisco, int capacidad, double consumo) {
		super(marca, modelo, precio);
		this.tipoDisco = tipoDisco;
		this.capacidad = capacidad;
		this.consumo = consumo;
		
	}

	/**
	 * Devuelve el tipo del disco
	 * @return String tipoDisco
	 */
	public String getTipoDisco() {
		return tipoDisco;
	}
	
	/**
	 * Modifica el tipo del disco
	 * @param
	 */
	public void setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
	}
	
	/**
	 * Devuelve la capacidad del disco
	 * @return int capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	
	/**
	 * Modifica la capacidad del disco
	 * @param
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	/**
	 * Devuelve el consumo del disco
	 * @return double consumo
	 */
	public double getConsumo() {
		return consumo;
	}
	
	/**
	 * Modifica el consumo del disco
	 * @param
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	/**
	 * Devuelve los detalles del componente
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString() + " " + getTipoDisco() + " " + getCapacidad() +  " " + getConsumo();
	}

}
