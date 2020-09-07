package co.edu.unbosque.controller;

import javax.swing.JOptionPane;


import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.Vista;

public class Controller {
	
	private Lectura dig;
	private Vista vista;
	private int a;
	private int resultado;
	
	public Controller () {
		a=0;
		dig= new Lectura();
		vista=new Vista();
		resultado=0;
		reproducir();
		
	}
	
	public void reproducir() {
		 
 		vista.imprimirMensaje("Bienvenido");

 		while (a!=4) {
			try {
				dig.setNum(vista.capturarDato(" Ingrese un digito"));
			    if (dig.getNum()<0||dig.getNum()>9) {
			    	vista.imprimirMensajeError("Ingreso un dato mayor a 9 o menor a 0");
				    dig.setNum(vista.capturarDato(" Error, ingrese un digito"));
			    }	
			
			} catch (Exception ex )  {
				vista.imprimirMensajeError("Ingreso un tipo de dato no valido");
				dig.setNum(vista.capturarDato(" Error, ingrese un digito"));
			}
			
			a=dig.compararDigitos(dig.getNum());
			resultado+=dig.contarDigitos(dig.getNum());
			
		}
		vista.imprimirMensaje("La cantidad de digitos que ingreso\n y no hacen parte de 9601 son " + resultado);
	}
	
	
}
