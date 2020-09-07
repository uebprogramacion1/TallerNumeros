package co.edu.unbosque.controller;

import co.edu.unbosque.model.Digitos;
import co.edu.unbosque.view.Dialogos;

public class Controlador {  
	private Digitos modelo = new Digitos();
	private Dialogos vista = new Dialogos();
	
	public Controlador() {
		String digitos = modelo.digitosIngresados();
		boolean activo = true;
		while(activo) {
			
			int digito = Integer.parseInt(vista.input(System.in, "ingresa un digito ", digitos));
			modelo.almacenarDigitos(digito);
			digitos += modelo.digitosIngresados();
			if(digitos.contains("9601")) {
				vista.output("termino la operación", digitos);
				activo=false;
			}
		}
	}
}
