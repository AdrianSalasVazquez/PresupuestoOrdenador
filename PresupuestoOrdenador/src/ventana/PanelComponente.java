package ventana;

import java.awt.*;
import java.util.ArrayList;

public class PanelComponente {

private Panel panelComponente = new Panel();
	
	public PanelComponente(String nombre, ArrayList<String> listaNombres) {
		panelComponente.add(new Label(nombre + ": "));
		
		Choice lista = new Choice();
		for(int i = 0; i < listaNombres.size(); i++) {
			lista.add(listaNombres.get(i));
		}
		panelComponente.add(lista);
		
		
	}
	
	public Panel getPanel() {
		return panelComponente;
	}
	
}
