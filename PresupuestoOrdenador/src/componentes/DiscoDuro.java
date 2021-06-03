package componentes;

public class DiscoDuro extends Componente {
	private String tipoDisco;
	private int capacidad;
	private String interfaz;
	private int tamanoFisico;
	private int consumo;
	
	public DiscoDuro(String marca, String modelo, double precio, String tipoDisco, int capacidad, int tamanoFisico, String interfaz, int consumo) {
		super(marca, modelo, precio);
		this.tipoDisco = tipoDisco;
		this.capacidad = capacidad;
		this.interfaz = interfaz;
		this.tamanoFisico = tamanoFisico;
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
	
	public String getInterfaz() {
		return interfaz;
	}
	
	public void setInterfaz(String interfaz) {
		this.interfaz = interfaz;
	}
	
	public int getTamanoFisico() {
		return tamanoFisico;
	}
	
	public void setTamanoFisico(int tamanoFisico) {
		this.tamanoFisico = tamanoFisico;
	}
	
	public int getConsumo() {
		return consumo;
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getTipoDisco() + " " + getCapacidad() + " " + getInterfaz() + " " + getTamanoFisico() + " " + getConsumo();
	}

}
