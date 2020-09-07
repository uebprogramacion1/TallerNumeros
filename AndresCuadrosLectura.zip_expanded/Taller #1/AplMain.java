package co.edu.unbosque.controller;

import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.View;

public class AplMain {

	public static void main(String[] args) {

		Lectura lectura = new Lectura();
		View view = new View();
		Controller controller = new Controller(lectura, view);

	}

}
