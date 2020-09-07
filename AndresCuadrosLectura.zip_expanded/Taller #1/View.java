package co.edu.unbosque.view;

import javax.swing.*;

public class View {

	public JLabel etiquetaResultado;
	public JLabel etiquetaDigito;

	public JTextField campoDigito;

	public JButton botonIngresar;

	public View() {
		JFrame ventana = new JFrame("Digito 9601");
		JPanel panel = new JPanel();

		etiquetaResultado = new JLabel("\n");
		etiquetaDigito = new JLabel("\nDigito: ");

		campoDigito = new JTextField(10);

		panel.add(etiquetaDigito);
		panel.add(campoDigito);
		panel.add(etiquetaResultado);

		botonIngresar = new JButton("Ingresar");

		panel.add(botonIngresar);

		ventana.setContentPane(panel);
		ventana.setResizable(false);
		ventana.setVisible(true);
		ventana.setSize(500, 250);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
