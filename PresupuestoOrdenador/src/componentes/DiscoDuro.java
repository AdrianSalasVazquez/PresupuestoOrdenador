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
	 * @return 
	 */
	public String getTipoDisco() {
		return tipoDisco;
	}
	
	public void setTipoDisco(String tipoDisco) {
		this.tipoDisco = tipoDisco;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public double getConsumo() {
		return consumo;
	}
	
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getTipoDisco() + " " + getCapacidad() +  " " + getConsumo();
	}

}
