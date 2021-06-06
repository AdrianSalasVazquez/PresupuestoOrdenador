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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getTipoFuente() {
		return tipoFuente;
	}

	public void setTipoFuente(String tipoFuente) {
		this.tipoFuente = tipoFuente;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getPotencia() + " " + getTipoFuente() + " " + getCertificacion();
	}
	
	
}
