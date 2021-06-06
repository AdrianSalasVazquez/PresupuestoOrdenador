package componentes;

public class TarjetaGrafica extends Componente {

	private String memoriaGrafica;
	private double consumo;
	
	
	public TarjetaGrafica(String marca, String modelo, String memoriaGrafica, double consumo, double precio) {
		super(marca, modelo, precio);
		this.memoriaGrafica = memoriaGrafica;
		this.consumo = consumo;
	}

	

	/**
	 * @return the memoriaGrafica
	 */
	public String getMemoriaGrafica() {
		return memoriaGrafica;
	}



	/**
	 * @param memoriaGrafica the memoriaGrafica to set
	 */
	public void setMemoriaGrafica(String memoriaGrafica) {
		this.memoriaGrafica = memoriaGrafica;
	}


	/**
	 * @return the consumo
	 */
	public double getConsumo() {
		return consumo;
	}



	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}



	@Override
	public String toString() {
		return super.toString() + " " + getMemoriaGrafica() + " " + " " + getConsumo();
	}
	
	
}
