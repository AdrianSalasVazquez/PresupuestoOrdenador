package ventana;

import java.awt.Frame;
import java.awt.event.WindowEvent;

public class VentanaPresupuesto extends Frame{

	public VentanaPresupuesto(String titulo, int ancho, int largo, int x, int y) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.setLocation(x,y);
		this.addWindowListener(new ControlVentana());
		this.setVisible(true);
	}
	
	public VentanaPresupuesto(String titulo, int ancho, int largo) {
		this.setTitle(titulo);
		this.setSize(ancho, largo);
		this.addWindowListener(new ControlVentana());
		this.setVisible(true);
	}
	
	public VentanaPresupuesto(int ancho, int largo) {
		this.setTitle("Presupuesto");
		this.setSize(ancho, largo);
		this.addWindowListener(new ControlVentana());
		this.setVisible(true);
	}
	
	public VentanaPresupuesto() {
		this("Presupuesto", 400, 400);
		this.addWindowListener(new ControlVentana());
	}
	
}
