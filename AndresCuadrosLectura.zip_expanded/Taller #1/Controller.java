package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	Lectura lectura = null;
	View view = null;

	public Controller(Lectura lectura, View view) {
		this.lectura = lectura;
		this.view = view;
		actionListener(this);

	}

	public void actionListener(ActionListener escuchador) {

		view.botonIngresar.addActionListener(escuchador);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (view.botonIngresar == e.getSource()) {
			if (!"".equals(view.campoDigito.getText())) {
				try {
					String pDigito = view.campoDigito.getText();
					int dg = Integer.parseInt(pDigito);
					if (dg < 0 || dg >= 10) {
						view.etiquetaResultado.setText("\nEl numero ingresado no es valido");
						view.campoDigito.setText("");
					} else {
						String r = lectura.Comparar(dg);
						view.etiquetaResultado.setText(r);
						view.campoDigito.setText("");
					}
				} catch (Exception q) {
					System.out.print(q);

				}
			}
		}

	}

}
