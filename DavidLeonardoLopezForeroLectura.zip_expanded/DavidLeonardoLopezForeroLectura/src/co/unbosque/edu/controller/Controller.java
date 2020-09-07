package co.unbosque.edu.controller;

import co.unbosque.edu.model.Lectura;
import co.unbosque.edu.view.View;

public class Controller {

	private View view;
	private Lectura lectura;

	public Controller() {

		view = new View();
		lectura = new Lectura();
		funcionar();

	}

	public void funcionar() {

		while (lectura.getDigitosCorrectos().size() != 4) {

			int a = view.capturarN�meros("\tBienvenido se�or usuario :)"
					+ "\nSe�or usuario ingrese n�meros entre cero (0) y nueve (9), hasta que se completen los d�gitos de la cifra 9601 (un digito a la vez)  ");
			view.imprimirMensaje(lectura.ingresarDigito(a));

		}

		view.imprimirMensaje(
				"Se�or usuario la cantidad de los numeros ingresados diferentes a los digitos de la cifra 9601 son: "
						+ "\n " + lectura.getDigitosIncorrectos().size() + "" + "\nDichos numeros son:   "
						+ lectura.getDigitosIncorrectos()
						+ "\nEl orden de los digitos ingresados que concuerdan con los digitos de la cifra 9601 : "
						+ "\n" + lectura.getDigitosCorrectos());

	}
}
