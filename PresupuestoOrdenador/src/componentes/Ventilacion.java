package componentes;

public class Ventilacion extends Componente {
	String tipoVentilacion;
	int numVentiladores;
	double consumo;
	
	public Ventilacion(String marca, String modelo, double precio, String tipoVentilacion, int numVentiladores, double consumo) {
		super(marca, modelo, precio);
		this.tipoVentilacion = tipoVentilacion;
		this.numVentiladores = numVentiladores;
		this.consumo = consumo;
	}
	
	public String getTipoVentilacion() {
		return tipoVentilacion;
	}

	public void setTipoVentilacion(String tipoVentilacion) {
		this.tipoVentilacion = tipoVentilacion;
	}

	public int getNumVentiladores() {
		return numVentiladores;
	}

	public void setNumVentiladores(int numVentiladores) {
		this.numVentiladores = numVentiladores;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getTipoVentilacion() + " " + getNumVentiladores() + " " + getConsumo();
	}
}
