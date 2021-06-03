package excepciones;

public class ValidarComponentes {
	private boolean esBien(String m) {
		return false;
	}

	public void validar(String coordenada) throws Excepciones{
		if(coordenada.length() != 2) {
			throw new Excepciones(Excepciones.NO_VALIDOS);
		} 
	}
}
