package main;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import ventana.PanelComponente;
import ventana.VentanaPresupuesto;

public class PresupuestoMain {

	public static void main(String[] args) {
		
		VentanaPresupuesto ventana = new VentanaPresupuesto(300, 300);
		
		Panel panel1 = new Panel(new GridLayout(2, 2, 1, 10));
		
		ventana.add(panel1);
		
		Button botonSobremesa = new Button("Sobremesa");
		Button botonPortatil = new Button("Portatil");
		Button guardarPresupuesto = new Button("Guardar Presupuesto");
		panel1.add(botonSobremesa);
		panel1.add(botonPortatil);
		
		String[] listaGraficas = new String[4];
		listaGraficas[0] = "NVIDIA 1080";
		listaGraficas[1] = "NVIDIA 1070";
		listaGraficas[2] = "NVIDIA 1060";
		listaGraficas[3] = "NVIDIA 1050";
		
		String[] listaProcesadores = new String[4];
		listaProcesadores[0] = "AMD Ryzen 5";
		listaProcesadores[1] = "Intel Core I5";
		listaProcesadores[2] = "AMD Ryzen 3";
		listaProcesadores[3] = "Intel Core I7";
		
		String[] listaVentilacion = new String[4];
		listaVentilacion[0] = "Aerocool Astro 12 RGB Ventilador 120mm";
		listaVentilacion[1] = "Nox Hummer H-224 Noir Ventilador CPU";
		listaVentilacion[2] = "Mars Gaming MCPU120 Ventilador CPU RGB 120mm";
		listaVentilacion[3] = "Corsair Hydro H60 Kit de Refrigeración Líquida";
		
		String[] listaPlacaBase = new String[4];
		listaPlacaBase[0] = "Asus Prime H370M Plus";
		listaPlacaBase[1] = "MSI Z490-A PRO";
		listaPlacaBase[2] = "Gigabyte B365M-DS3H";
		listaPlacaBase[3] = "MSI MPG Z490 GAMING PLUS";
		
		String[] listaMemoriaRam = new String[4];
		listaMemoriaRam[0] = "Corsair Vengeance AMD DDR4 3200Mhz 16GB 2x8GB CL16";
		listaMemoriaRam[1] = "Kingston HyperX Fury Black 16GB DDR4 2666Mhz (2x8GB) CL16";
		listaMemoriaRam[2] = "G.Skill Trident Z RGB DDR4 3200 16GB 2x8GB CL16";
		listaMemoriaRam[3] = "Team Group T-Force Delta DDR4 3600MHz 16GB 2x8GB CL18";
		
		String[] listaFuenteAlimentacion = new String[4];
		listaFuenteAlimentacion[0] = "EVGA W1 600W 80 Plus";
		listaFuenteAlimentacion[1] = "Nox Urano VX 650W 80+ Bronze 120MM PWM";
		listaFuenteAlimentacion[2] = "Thermaltake Smart RGB 700W 80 Plus";
		listaFuenteAlimentacion[3] = "Corsair TX850M 850W 80 Plus Gold Semi Modular";
		
		String[] listaDiscoDuro = new String[4];
		listaDiscoDuro[0] = "Toshiba L200 2.5 1TB SATA 3";
		listaDiscoDuro[1] = "Toshiba P300 3.5 2 TB 7200RPM SATA";
		listaDiscoDuro[2] = "Toshiba P300 3.5 3TB 7200 RPM SATA";
		listaDiscoDuro[3] = "Toshiba X300 3.5 4TB SATA III";
		
		String[] listaCaja = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		botonSobremesa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ventana.dispose();
				VentanaPresupuesto ventanaSobremesa = new VentanaPresupuesto("Sobremesa", 600, 600);
				Panel panelSobre1 = new Panel(new GridLayout(8,1));
				panelSobre1.add(new PanelComponente("Placa Base",listaPlacaBase).getPanel());
				panelSobre1.add(new PanelComponente("Procesadores",listaProcesadores).getPanel());
				panelSobre1.add(new PanelComponente("Tarjetas Graficas",listaGraficas).getPanel());
				panelSobre1.add(new PanelComponente("Fuente de alimentacion",listaFuenteAlimentacion).getPanel());
				panelSobre1.add(new PanelComponente("Ventilacion",listaVentilacion).getPanel());
				panelSobre1.add(new PanelComponente("Memoria RAM",listaMemoriaRam).getPanel());
				panelSobre1.add(new PanelComponente("Disco Duro",listaDiscoDuro).getPanel());
				panelSobre1.add(new PanelComponente("Caja",listaCaja).getPanel());
				panelSobre1.add(guardarPresupuesto);
				ventanaSobremesa.add(panelSobre1);
			}
		});
		
		String[] placasBases = new String[4];
		listaCaja[0] = "Intel Core i5-1135G7";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] procesadores = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] discosDuros = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] ventilacion = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] memoriaRam = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] marca = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] modelo = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] numeroUsb = new String[4];
		listaCaja[0] = "Silverstone PS15 Torre Micro ATX Cristal Templado Blanca";
		listaCaja[1] = "SilverStone PS13 Torre ATX Negra";
		listaCaja[2] = "Thermaltake Tower 100 Mini Torre Blanca";
		listaCaja[3] = "BitFenix Enso Torre ATX Cristal Templado RGB Negra";
		
		String[] ethernet = new String[2];
		ethernet[0] = "Tiene ethernet";
		ethernet[1] = "No tiene ethernet";
		
		String[] bateria = new String[4];
		bateria[0] = "ASUNCELL para HP COMPAQ";
		bateria[1] = "ARyee para ASUS A41-X550A";
		bateria[2] = "Green Cell para HP JC04";
		bateria[3] = "NinjaBatt para Toshiba L50";
		
		botonPortatil.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ventana.dispose();
				VentanaPresupuesto ventanaPortatil = new VentanaPresupuesto("Portatil", 600, 600);
				Panel panelPortatil1 = new Panel(new GridLayout(10,1));
				ventanaPortatil.add(panelPortatil1);
				panelPortatil1.add(new PanelComponente("Placa Base",listaPlacaBase).getPanel());
				panelPortatil1.add(new PanelComponente("Procesadores",listaProcesadores).getPanel());
				panelPortatil1.add(new PanelComponente("Disco Duro",listaVentilacion).getPanel());
				panelPortatil1.add(new PanelComponente("Ventilacion",listaMemoriaRam).getPanel());
				panelPortatil1.add(new PanelComponente("Memoria RAM",listaDiscoDuro).getPanel());
				panelPortatil1.add(new PanelComponente("Marca",listaCaja).getPanel());
				panelPortatil1.add(new PanelComponente("Modelo",listaDiscoDuro).getPanel());
				panelPortatil1.add(new PanelComponente("Numero USB",listaDiscoDuro).getPanel());
				panelPortatil1.add(new PanelComponente("Ethernet",ethernet).getPanel());
				panelPortatil1.add(new PanelComponente("Bateria",bateria).getPanel());
				ventanaPortatil.add(panelPortatil1);
				
			}
		});
	}
}