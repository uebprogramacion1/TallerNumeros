package co.unbosque.edu.model;

import java.util.ArrayList;

public class Lectura {

	private ArrayList<Integer> digitosCorrectos;
	private ArrayList<Integer> digitosIncorrectos;

	public Lectura() {

		digitosCorrectos = new ArrayList<Integer>();
		digitosIncorrectos = new ArrayList<Integer>();

	}

	public String ingresarDigito(int b) {
		String resultado = "";
		
		String dig = Integer.toString(b);
		if (dig.length() == 1) {

			resultado = "El digito se a guardado exitosamente";

			if (b == 9 || b == 6 || b == 0 || b == 1) {

				digitosCorrectos.add(b);

			} else {
				digitosIncorrectos.add(b);

			}
		} else {

			resultado = "Señor usuario ingrese solo un digito";

		}
		return resultado;

	}

	public ArrayList<Integer> getDigitosCorrectos() {
		return digitosCorrectos;
	}

	public void setDigitosCorrectos(ArrayList<Integer> digitosCorrectos) {
		this.digitosCorrectos = digitosCorrectos;
	}

	public ArrayList<Integer> getDigitosIncorrectos() {
		return digitosIncorrectos;
	}

	public void setDigitosIncorrectos(ArrayList<Integer> digitosIncorrectos) {
		this.digitosIncorrectos = digitosIncorrectos;
	}

}
