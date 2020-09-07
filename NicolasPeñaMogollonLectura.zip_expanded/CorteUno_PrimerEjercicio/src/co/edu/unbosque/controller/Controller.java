package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Lectura;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private Lectura lectura;
	private View vistaLectura;

	public Controller() {
		this.lectura = new Lectura();
		this.vistaLectura = new View();
		actionListener(this);
	}

	private void actionListener(ActionListener escuchador) {

		this.vistaLectura.getBotonIngresar().addActionListener(escuchador);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {

		if (this.vistaLectura.getBotonIngresar() == evento.getSource()) {

			try {
				int entrada = Integer.parseInt(this.vistaLectura.getCampoTextoDigito().getText());

				if (entrada <= 9 && entrada >= 0) {

					String cadenaNumero = entrada + "";
					this.vistaLectura.getEtiquetaResultado().setText(this.lectura.validarDigito(cadenaNumero));
					this.vistaLectura.getCampoTextoDigito().setText("");

					if (this.lectura.getNumero().isEmpty()) {

						this.vistaLectura
								.imprimirCompletado("Felicitaciones!!!\n Número de dígitos distintos ingresados: "
										+ this.lectura.getContador());
						// Cierra la ventana principal y si no hay alguna abierta finaliza el programa
						this.vistaLectura.dispose();

					}
				} else {
					this.vistaLectura.imprimirError();
					this.vistaLectura.getCampoTextoDigito().setText("");
				}
			} catch (NumberFormatException a) {
				this.vistaLectura.imprimirError();
				this.vistaLectura.getCampoTextoDigito().setText("");
			}
		}

	}
}
