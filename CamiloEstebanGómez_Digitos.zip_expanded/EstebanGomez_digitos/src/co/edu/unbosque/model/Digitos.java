package co.edu.unbosque.model;

public class Digitos {
	private int[] numeros = null;

	public void almacenarDigitos(int dato) {
		int longitud = 1;
		numeros = new int[longitud];
		numeros[numeros.length - 1] = dato;
		longitud++;

	}

	public int[] getNumeros() {
		return numeros;
	}

	public String digitosIngresados() {
		String digitos = "";
		try {
			for (int i = 0; i < numeros.length; i++) {
				digitos += numeros[i];
			}
		} catch (NullPointerException e) {
			digitos = "";
			

		}
		return digitos;
	}
}
