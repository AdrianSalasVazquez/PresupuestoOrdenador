package main;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PresupuestoMain {

	public static void main(String[] args) {
		
		Frame ventana = new Frame();
		ventana.setTitle("Presupuesto PC");
		ventana.setSize(600, 600);
		ventana.setVisible(true);
		
		Panel panel1 = new Panel();
		
		ventana.add(panel1);
		
		CheckboxGroup tipoPc = new CheckboxGroup();
		Checkbox sobremesa = new Checkbox("Sobremesa", false, tipoPc);
		Checkbox portatil = new Checkbox("Portatil", false, tipoPc);
		panel1.add(sobremesa);
		panel1.add(portatil);
		
		if(sobremesa.getState()) {
			
			List placaBase = new List(4, true);
			
			placaBase.add("MSI Z490-A PRO");
			placaBase.add("Gigabyte B550M DS3H");
			placaBase.add("MSI Mpg Z390 Gaming Plus");
			
			panel1.add(placaBase);
			
		}else if(portatil.getState()) {
			
			
			
		}
		
		
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
