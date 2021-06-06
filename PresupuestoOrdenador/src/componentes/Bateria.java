package componentes;

public class Bateria extends Componente {
	double voltaje;
	String tipoPila;
	int carga;
	
	public Bateria(String marca, String modelo, double precio, double voltaje, String tipoPila, int carga) {
		super(marca, modelo, precio);
		this.voltaje = voltaje;
		this.tipoPila = tipoPila;
		this.carga = carga;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public String getTipoPila() {
		return tipoPila;
	}

	public void setTipoPila(String tipoPila) {
		this.tipoPila = tipoPila;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getVoltaje() + " " + getTipoPila() + " " + getCarga();
	}
	
	
}
