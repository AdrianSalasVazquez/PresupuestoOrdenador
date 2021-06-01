package componentes;

public class Ventilacion extends Componente {
	String tipoVentilacion;
	int numVentiladores;
	String socket;
	int consumo;
	
	public Ventilacion(String marca, String modelo, double precio, String tipoVentilacion, int numVentiladores, String socket, int consumo) {
		super(marca, modelo, precio);
		this.tipoVentilacion = tipoVentilacion;
		this.numVentiladores = numVentiladores;
		this.socket = socket;
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

	public String getSocket() {
		return socket;
	}

	public void setSocket(String socket) {
		this.socket = socket;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return null;
	}
}
