package co.edu.unbosque.model;

import java.util.ArrayList;

public class Lectura {

	private boolean nueve = false;
	private boolean seis = false;
	private boolean cero = false;
	private boolean uno = false;
	ArrayList digitos = new ArrayList();

	public Lectura() {

	}

	public String Comparar(int d) {
		String r = "";
		if (nueve == true && seis == true && cero == true && uno == true) {
			r = "La cifra 9601 esta completa, los digitos diferentes fueron: " + digitos;
		} else {
			switch (d) {
			case 9:
				nueve = true;
				r = "Numero ingresado";
				break;
			case 6:
				seis = true;
				r = "Numero ingresado";
				break;
			case 0:
				cero = true;
				r = "Numero ingresado";
				break;
			case 1:
				uno = true;
				r = "Numero ingresado";
				break;
			default:
				digitos.add(d);
				r = "Numero ingresado";
				break;
			}
		}
		return r;
	}

}
