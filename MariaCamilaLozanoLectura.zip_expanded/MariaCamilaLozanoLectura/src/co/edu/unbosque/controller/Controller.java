package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

public class Controller implements ActionListener {

	public Lectura lra;
	public View vLectura;

	public Controller() {
		this.lra = new Lectura();
		this.vLectura = new View();
		actionListener(this);

	}

	public void actionListener(ActionListener escuchador) {
		this.vLectura.getRegistro().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent objEvento) {
		if (this.vLectura.getRegistro() == objEvento.getSource()) {
			int a = Integer.parseInt(this.vLectura.gettDigito().getText());
			if (a >= 0 && a <= 9) {
				String b = (new StringBuilder(String.valueOf(a))).toString();
				this.vLectura.getResultado().setText(this.lra.ingresarNum(b));
				if (this.lra.getNum().isEmpty()) {
					this.vLectura.resultadoCorrecto(
							"Número 9601 completado :D \n Dígitos diferentes: " + this.lra.getCont());
				}
			} else {
				this.vLectura.resultadoErroneo();
			}
		}
	}
}