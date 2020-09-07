package unbosque.edu.co.model;

import unbosque.edu.co.view.Vista;

public class Lectura {
	private String digito = "";
	private int contador;
	private boolean control;
	
	Vista vW = new Vista();

	public int iniciar() {
		while ( contador == 4) {
			vW.ingresoDeDatos();
			
		}
		return iniciar();
	}
	public boolean finalizar() {
	if (Integer.parseInt(digito) == 2 && Integer.parseInt(digito) == 0 && Integer.parseInt(digito) == 6 && Integer.parseInt(digito) == 1 ) {
		control = true;
		contador = contador + 1;
	}
	return false;
}
	public String getDigito() {
		return digito;
	}
	public void setDigito(String digito) {
		this.digito = digito;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public boolean isControl() {
		return control;
	}
	public void setControl(boolean control) {
		this.control = control;
	}
	 
}	 
