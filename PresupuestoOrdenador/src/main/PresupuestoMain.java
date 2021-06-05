package main;

import java.awt.*;
import java.awt.event.*;

import ventana.VentanaPresupuesto;

public class PresupuestoMain {

	public static void main(String[] args) {
		
		VentanaPresupuesto ventana = new VentanaPresupuesto(600, 600);
		
		
		Panel panel1 = new Panel();
		
		ventana.add(panel1);
		
		Button botonSobremesa = new Button("Sobremesa");
		Button botonPortatil = new Button("Portatil");
		panel1.add(botonSobremesa);
		panel1.add(botonPortatil);
		
		botonSobremesa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				VentanaPresupuesto ventanaSobremesa = new VentanaPresupuesto("Sobremesa", 600, 600);
				Panel panelSobre1 = new Panel();
				ventanaSobremesa.add(panelSobre1);
				
			}
		});
		
		botonPortatil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				VentanaPresupuesto ventanaPortatil = new VentanaPresupuesto("Portatil", 600, 600);
				Panel panelPortatil1 = new Panel();
				ventanaPortatil.add(panelPortatil1);
				
			}
		});
		
		ventana.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

}
