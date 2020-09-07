package co.edu.unbosque.controller;

import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.Vista;

public class Controller {
	
	private Vista vista;
	private Lectura num;
	private int cont;
	
	public Controller() {
		vista = new Vista();
		num = new Lectura();
		cont = 0;
		
		
		funcionar();
	}
	
	public void funcionar() {
		
		vista.imprimirMensaje(".: BIENVENIDO AL PROGRAMA 9601.");
		
		 
		while( num.leerDigitos(num.getDigito())!=9601) {
		
		num.setDigito(vista.capturarDato("Escriba digitos del 0 al 9"));
		
		if(num.getDigito()<0 || num.getDigito()>9) {
			vista.imprimirMensaje("ERROR. Ingreso un número no valido, favor ingresar digitos del 1 al 9");
		}
		cont +=num.contarDigitos(num.getDigito());
		
            }
		vista.imprimirMensaje("La cantidad de digitos ingresados diferentes a los del número 9601 fueron:\n" + cont);
	}

}
