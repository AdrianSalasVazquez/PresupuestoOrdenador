package ventana;

import java.awt.Frame;

public class VentanaPresupuesto extends Frame{

	public VentanaPresupuesto(String titulo, int ancho, int largo, int x, int y) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.setLocation(x,y);
		this.setVisible(true);
	}
	
	public VentanaPresupuesto(String titulo, int ancho, int largo) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.setVisible(true);
	}
	
	public VentanaPresupuesto(int ancho, int largo) {
		this.setTitle("Presupuesto");
		this.setSize(ancho, largo);
		this.setVisible(true);
	}
	
	public VentanaPresupuesto() {
		this("Presupuesto", 400, 400);
	}
	
}
