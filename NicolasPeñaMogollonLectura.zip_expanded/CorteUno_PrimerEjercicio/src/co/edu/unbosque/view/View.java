package co.edu.unbosque.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {

	private JTextField campoTextoDigito;
	private JButton botonIngresar;
	private JLabel etiquetaTitulo;
	private JLabel etiquetaResultado;
	private JPanel panelEntrada;
	private JPanel panelRegistro;

	public View() {

		super("At�nele al n�mero");
		this.setLayout(new GridLayout(2, 1));
		this.setSize(300, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.inicializar();
		this.setVisible(true);
	}

	public void inicializar() {

		panelEntrada = new JPanel();
		panelEntrada.setLayout(new GridLayout(1, 2));

		etiquetaTitulo = new JLabel("Ingrese un d�gito: ");
		this.panelEntrada.add(etiquetaTitulo);
		campoTextoDigito = new JTextField();
		this.panelEntrada.add(campoTextoDigito);

		panelRegistro = new JPanel();
		panelRegistro.setLayout(new GridLayout(1, 2));

		botonIngresar = new JButton("Registrar d�gito");
		this.panelRegistro.add(botonIngresar);
		etiquetaResultado = new JLabel("");
		this.panelRegistro.add(etiquetaResultado);

		this.add(panelEntrada);
		this.add(panelRegistro);

	}

	public void imprimirCompletado(String message) {
		JOptionPane.showMessageDialog(null, message, "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
	}

	public void imprimirError() {
		JOptionPane.showMessageDialog(null, "El valor ingresado no est� dentro del rango permitido!!!", "Error",
				JOptionPane.WARNING_MESSAGE);
	}

	public JTextField getCampoTextoDigito() {
		return campoTextoDigito;
	}

	public void setCampoTextoDigito(JTextField campoTextoDigito) {
		this.campoTextoDigito = campoTextoDigito;
	}

	public JButton getBotonIngresar() {
		return botonIngresar;
	}

	public void setBotonIngresar(JButton botonIngresar) {
		this.botonIngresar = botonIngresar;
	}

	public JLabel getEtiquetaTitulo() {
		return etiquetaTitulo;
	}

	public void setEtiquetaTitulo(JLabel etiquetaTitulo) {
		this.etiquetaTitulo = etiquetaTitulo;
	}

	public JLabel getEtiquetaResultado() {
		return etiquetaResultado;
	}

	public void setEtiquetaResultado(JLabel etiquetaResultado) {
		this.etiquetaResultado = etiquetaResultado;
	}

	public JPanel getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(JPanel panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public JPanel getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(JPanel panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

}
