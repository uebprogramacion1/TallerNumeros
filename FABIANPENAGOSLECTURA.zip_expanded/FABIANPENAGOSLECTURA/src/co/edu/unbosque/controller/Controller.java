package co.edu.unbosque.controller;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.View;

public class Controller {
	Lectura dig;
	View vs;
	public Controller() {
		dig=new Lectura();
		vs=new View();
		comprobarEntrada();
	
	}
	
	
	public String comprobarEntrada() {
	boolean condicion=dig.verificarCifra();
	String entradas="";
		while(condicion==false) {
			try {
			String di=JOptionPane.showInputDialog("ingrese un digito entre 0 y 9");
			int digito=Integer.parseInt(di);
			boolean condicion2=false;
			if(digito>=10 || digito<0) {
				while(condicion2==false) {
					 di=JOptionPane.showInputDialog(" rango incorrecto ,ingrese un digito entre 0 y 9");
					 digito=Integer.parseInt(di);
					 
					 if(digito>=10 || digito<0) {
						
					 }else {
						 condicion2=true;
						 dig.leerdigito(digito);
						boolean condicion3= dig.comprobarDigito(digito);
						 if(condicion3==true) {
							  entradas+=digito+" , ";
						 }
						
						
					 }
				}
			}else {
				boolean condicion4= dig.comprobarDigito(digito);
				dig.leerdigito(digito);
				
				 if(condicion4==true) {
					  entradas+=digito+" , ";
				 }
			
				
			}
				
			}catch(NumberFormatException nex) {
			JOptionPane.showMessageDialog(null, "digito incorrecto solo digitos del 0 al 9 ");	
			}
			
			condicion=dig.verificarCifra();
		}
		mostrarentradas(entradas);
		return entradas;
	}
	public void mostrarentradas(String numeros) {
		vs.mostrarNumeros(numeros);

	}

}