package main;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import componentes.*;
import ventana.*;

public class PresupuestoMain {

	public static void main(String[] args) {
		
		ArrayList<MemoriaRam> ram = null;
		ArrayList<PlacaBase> placa = null;
		ArrayList<Ventilacion> ventilacion = null;
		ArrayList<Bateria> bateria = null;
		ArrayList<Caja> caja = null;
		ArrayList<DiscoDuro> discoDuro = null;
		ArrayList<FuenteAlimentacion> fuente = null;
		ArrayList<Procesador> procesador = null;
		ArrayList<TarjetaGrafica> graficas = null;
		
		VentanaPresupuesto ventana = new VentanaPresupuesto(400, 400);
		
		File archivoBaterias = new File("Componentes//Baterias.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> baterias = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					baterias.add(linea);
				}
			}
			br.close();
			
			bateria = new ArrayList();
			for(int i = 1; i < baterias.size(); i++) {
				 String datos = baterias.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 double voltaje = Double.parseDouble(palabrasSeparadas[3]);
				 String tipoPila = palabrasSeparadas[4];
				 int carga = Integer.parseInt(palabrasSeparadas[5]);
				 bateria.add(new Bateria(marca, modelo, precio, voltaje, tipoPila, carga));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoCajas = new File("Componentes//Cajas.txt");
		try {
			FileReader fr = new FileReader(archivoCajas);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> cajas = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					cajas.add(linea);
				}
			}
			br.close();
			
			caja = new ArrayList();
			for(int i = 1; i < cajas.size(); i++) {
				 String datos = cajas.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 String factorForma = palabrasSeparadas[3];
				 int numUsb = Integer.parseInt(palabrasSeparadas[4]);
				 int numHdd = Integer.parseInt(palabrasSeparadas[5]);
				 int numSsd = Integer.parseInt(palabrasSeparadas[6]);
				 int numPci = Integer.parseInt(palabrasSeparadas[7]);
				 String material = palabrasSeparadas[8];
				 double peso = Double.parseDouble(palabrasSeparadas[9]);
				 caja.add(new Caja(marca, modelo, precio, factorForma, numUsb, numHdd, numSsd, numPci, material, peso));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoDiscosDuros = new File("Componentes//DiscosDuros.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> discosDuros = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					discosDuros.add(linea);
				}
			}
			br.close();
			
			discoDuro = new ArrayList();
			for(int i = 1; i < discosDuros.size(); i++) {
				 String datos = discosDuros.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 String tipoDisco = palabrasSeparadas[3];
				 int capacidad = Integer.parseInt(palabrasSeparadas[4]);
				 double consumo = Double.parseDouble(palabrasSeparadas[5]);
				 discoDuro.add(new DiscoDuro(marca, modelo, precio, tipoDisco, capacidad, consumo));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoFuentes = new File("Componentes//FuentesAlimentacion.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> fuentes = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					fuentes.add(linea);
				}
			}
			br.close();
			
			fuente = new ArrayList();
			for(int i = 1; i < fuentes.size(); i++) {
				 String datos = fuentes.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 int potencia = Integer.parseInt(palabrasSeparadas[3]);
				 String tipoFuente = palabrasSeparadas[4];
				 String certificacion = palabrasSeparadas[5];
				 fuente.add(new FuenteAlimentacion(marca, modelo, precio, potencia, tipoFuente, certificacion));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoRam = new File("Componentes//MemoriasRAM.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> memoriasRam = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					memoriasRam.add(linea);
				}
			}
			br.close();
			
			ram = new ArrayList();
			for(int i = 1; i < memoriasRam.size(); i++) {
				 String datos = memoriasRam.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 int numModulos = Integer.parseInt(palabrasSeparadas[3]);
				 int tamano = Integer.parseInt(palabrasSeparadas[4]);
				 String tipoMemoria = palabrasSeparadas[5];
				 int velocidad = Integer.parseInt(palabrasSeparadas[6]);
				 ram.add(new MemoriaRam(marca, modelo, precio, numModulos, tamano, tipoMemoria, velocidad));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoPlacasBase = new File("Componentes//PlacasBase.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> placasBase = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					placasBase.add(linea);
				}
			}
			br.close();

			placa = new ArrayList();
			for(int i = 1; i < placasBase.size(); i++) {
				 String datos = placasBase.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 String socket = palabrasSeparadas[2];
				 int numPci = Integer.parseInt(palabrasSeparadas[4]);
				 String factorForma = palabrasSeparadas[5];
				 double precio = Double.parseDouble(palabrasSeparadas[6]);
				 placa.add(new PlacaBase(marca, modelo, socket, numPci, factorForma, precio));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoProcesadores = new File("Componentes//Procesadores.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> procesadores = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					procesadores.add(linea);
				}
			}
			br.close();

			procesador = new ArrayList();
			for(int i = 1; i < procesadores.size(); i++) {
				 String datos = procesadores.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 int nucleos = Integer.parseInt(palabrasSeparadas[2]);
				 int hilos = Integer.parseInt(palabrasSeparadas[3]);
				 String velocidad = palabrasSeparadas[4];
				 double consumo = Double.parseDouble(palabrasSeparadas[5]);
				 double precio = Double.parseDouble(palabrasSeparadas[6]);
				 procesador.add(new Procesador(marca, modelo, nucleos, hilos, velocidad, consumo, precio));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoGraficas = new File("Componentes//TarjetasGraficas.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> tarjetasGraficas = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					tarjetasGraficas.add(linea);
				}
			}
			br.close();

			graficas = new ArrayList();
			for(int i = 1; i < tarjetasGraficas.size(); i++) {
				 String datos = tarjetasGraficas.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 String memoriaGrafica = palabrasSeparadas[2];
				 Double consumo = Double.parseDouble(palabrasSeparadas[3]);
				 double precio = Double.parseDouble(palabrasSeparadas[4]);
				 graficas.add(new TarjetaGrafica(marca, modelo, memoriaGrafica, consumo, precio));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		File archivoVentilaciones = new File("Componentes//Ventilaciones.txt");
		try {
			FileReader fr = new FileReader(archivoBaterias);
			BufferedReader br = new BufferedReader(fr);
			String linea = "";
			ArrayList<String> ventilaciones = new ArrayList();
			while(linea != null) {
				linea = br.readLine();
				if(linea != null) {
					ventilaciones.add(linea);
				}
			}
			br.close();
			
			ventilacion = new ArrayList();
			for(int i = 1; i < ventilaciones.size(); i++) {
				 String datos = ventilaciones.get(i);
				 String[] palabrasSeparadas = datos.strip().split("|");
				 String marca = palabrasSeparadas[0];
				 String modelo = palabrasSeparadas[1];
				 double precio = Double.parseDouble(palabrasSeparadas[2]);
				 String tipoVentilacion = palabrasSeparadas[3];
				 int numVentiladores = Integer.parseInt(palabrasSeparadas[4]);
				 double consumo = Double.parseDouble(palabrasSeparadas[5]);
				 ventilacion.add(new Ventilacion(marca, modelo, precio, tipoVentilacion, numVentiladores, consumo));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		Panel panel1 = new Panel(new GridLayout(2, 2, 0, 10));
		
		ventana.add(panel1);
		
		Button botonSobremesa = new Button("Sobremesa");
		Button botonPortatil = new Button("Portatil");
		Button guardarPresupuesto = new Button("Guardar Presupuesto");
		panel1.add(botonSobremesa);
		panel1.add(botonPortatil);
		
		ArrayList<String> listaPlacaBase = new ArrayList();
		for(int i = 0; i < placa.size(); i++) {
			listaPlacaBase.add(placa.get(i).getNombre());
		}
		
		ArrayList<String> listaGraficas = new ArrayList();
		for(int i = 0; i < graficas.size(); i++) {
			listaGraficas.add(graficas.get(i).getNombre());
		}
		
		ArrayList<String> listaProcesadores = new ArrayList();
		for(int i = 0; i < procesador.size(); i++) {
			listaGraficas.add(procesador.get(i).getNombre());
		}
		
		ArrayList<String> listaFuenteAlimentacion = new ArrayList();
		for(int i = 0; i < fuente.size(); i++) {
			listaGraficas.add(fuente.get(i).getNombre());
		}
		
		ArrayList<String> listaVentilacion = new ArrayList();
		for(int i = 0; i < ventilacion.size(); i++) {
			listaGraficas.add(ventilacion.get(i).getNombre());
		}
		
		ArrayList<String> listaMemoriaRam = new ArrayList();
		for(int i = 0; i < ram.size(); i++) {
			listaGraficas.add(ram.get(i).getNombre());
		}
		
		ArrayList<String> listaDiscoDuro = new ArrayList();
		for(int i = 0; i < discoDuro.size(); i++) {
			listaGraficas.add(discoDuro.get(i).getNombre());
		}
		
		ArrayList<String> listaCaja = new ArrayList();
		for(int i = 0; i < caja.size(); i++) {
			listaGraficas.add(caja.get(i).getNombre());
		}
		
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
		
		ArrayList<String> ethernet = new ArrayList();
		ethernet.add("Tiene ethernet");
		ethernet.add("No tiene ethernet");
		
		ArrayList<String> listaBateria = new ArrayList();
		for(int i = 0; i < bateria.size(); i++) {
			listaBateria.add(bateria.get(i).getNombre());
		}
		
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
				panelPortatil1.add(new PanelComponente("Ethernet",ethernet).getPanel());
				panelPortatil1.add(new PanelComponente("Bateria",listaBateria).getPanel());
				ventanaPortatil.add(panelPortatil1);
				
			}
		});
	}
}