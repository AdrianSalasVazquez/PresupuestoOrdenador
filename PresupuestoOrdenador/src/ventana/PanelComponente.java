package ventana;

import java.awt.*;

public class PanelComponente {

private Panel panelComponente = new Panel();
	
	public PanelComponente(String nombre, String[] listaNombres) {
		panelComponente.add(new Label(nombre + ": "));
		
		Choice lista = new Choice();
		for(int i = 0; i < listaNombres.length; i++) {
			lista.add(listaNombres[i]);
		}
		panelComponente.add(lista);
		
		
	}
	
	public Panel getPanel() {
		return panelComponente;
	}
	
}
