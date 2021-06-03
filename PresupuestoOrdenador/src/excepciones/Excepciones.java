package excepciones;

public class Excepciones extends Exception {
	
	private int componentesInvalidos = 0;
	static final int NO_VALIDOS = -1;

	public Excepciones() {
		super();
	}
	
	public Excepciones(String s) {
		super(s);
	}
	
	public Excepciones(int error) {
		this.componentesInvalidos = error;
	}
	
	public int getcomponentesInvalidos() {
		return this.componentesInvalidos;
	}
	
	public void setcomponentesInvalidos(int error) {
		this.componentesInvalidos = error;
	}

}
