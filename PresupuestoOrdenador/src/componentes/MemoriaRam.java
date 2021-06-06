package componentes;

public class MemoriaRam extends Componente {
	int numModulos;
	int tamano;
	String tipoMemoria;
	int velocidad;
	
	public MemoriaRam(String marca, String modelo, double precio, int numModulos, int tamano, String tipoMemoria, int velocidad) {
		super(marca, modelo, precio);
		this.numModulos = numModulos;
		this.tamano = tamano;
		this.tipoMemoria = tipoMemoria;
		this.velocidad = velocidad;
	}

	public int getNumModulos() {
		return numModulos;
	}

	public void setNumModulos(int numModulos) {
		this.numModulos = numModulos;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public String getModulos() {
		String resultado = getNumModulos() + "x" + getTamano();
		return resultado;
	}

	@Override
	public String toString() {
		return super.toString() + " " + getModulos() + " " + getTipoMemoria() + " " + getVelocidad();
	}
	
	
}
