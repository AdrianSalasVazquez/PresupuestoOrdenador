package main;

import java.awt.*;
import java.awt.event.*;

import ventana.PanelComponente;
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
		
		String[] listaGraficas = new String[4];
		listaGraficas[0] = "NVIDIA 1080";
		listaGraficas[1] = "NVIDIA 1070";
		listaGraficas[2] = "NVIDIA 1060";
		listaGraficas[3] = "NVIDIA 1050";
		
		botonSobremesa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ventana.dispose();
				VentanaPresupuesto ventanaSobremesa = new VentanaPresupuesto("Sobremesa", 600, 600);
				Panel panelSobre1 = new Panel(new GridLayout(8,1));
				panelSobre1.add(new PanelComponente("Tarjetas Graficas",listaGraficas).getPanel());
				ventanaSobremesa.add(panelSobre1);
				
			}
		});
		
		botonPortatil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ventana.dispose();
				VentanaPresupuesto ventanaPortatil = new VentanaPresupuesto("Portatil", 600, 600);
				Panel panelPortatil1 = new Panel();
				ventanaPortatil.add(panelPortatil1);
				
			}
		});
		
	}

}
