package componentes;

public class TarjetaGrafica extends Componente {

	private int memoriaGrafica;
	private String tipoMemoriaGrafica;
	private String resolucionMax;
	private int consumo;
	
	
	public TarjetaGrafica(String marca, String modelo, int memoriaGrafica, String tipoMemoriaGrafica, String resolucionMax, int consumo, double precio) {
		super(marca, modelo, precio);
		this.memoriaGrafica = memoriaGrafica;
		this.tipoMemoriaGrafica = tipoMemoriaGrafica;
		this.resolucionMax = resolucionMax;
		this.consumo = consumo;
	}

	

	/**
	 * @return the memoriaGrafica
	 */
	public int getMemoriaGrafica() {
		return memoriaGrafica;
	}



	/**
	 * @param memoriaGrafica the memoriaGrafica to set
	 */
	public void setMemoriaGrafica(int memoriaGrafica) {
		this.memoriaGrafica = memoriaGrafica;
	}



	/**
	 * @return the tipoMemoriaGrafica
	 */
	public String getTipoMemoriaGrafica() {
		return tipoMemoriaGrafica;
	}



	/**
	 * @param tipoMemoriaGrafica the tipoMemoriaGrafica to set
	 */
	public void setTipoMemoriaGrafica(String tipoMemoriaGrafica) {
		this.tipoMemoriaGrafica = tipoMemoriaGrafica;
	}



	/**
	 * @return the resolucionMax
	 */
	public String getResolucionMax() {
		return resolucionMax;
	}



	/**
	 * @param resolucionMax the resolucionMax to set
	 */
	public void setResolucionMax(String resolucionMax) {
		this.resolucionMax = resolucionMax;
	}



	/**
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}



	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}



	@Override
	public String toString() {
		return super.toString() + " " + getMemoriaGrafica() + " " + getTipoMemoriaGrafica() + " " + getResolucionMax() + " " + getConsumo();
	}
	
	
}
