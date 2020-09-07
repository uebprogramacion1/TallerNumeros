package co.edu.unbosque.controller;

import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Lectura leer;
	private View gui;
	
	public Controller() {
		leer = new Lectura();
		gui = new View();
		gui.mostrarResultados(leer.validarCifra(gui.pedirDato()));
	}
}
