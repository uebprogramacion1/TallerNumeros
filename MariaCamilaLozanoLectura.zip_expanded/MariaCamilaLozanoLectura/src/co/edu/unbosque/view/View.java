package co.edu.unbosque.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View extends JFrame {
	private JPanel contenedor;
	private JButton registro;
	private JPanel dRegistro;
	private JLabel titulo;
	private JTextField tDigito;
	private JLabel resultado;

	public View() {

		setTitle("Lectura de digitos");
		this.setLayout(new GridLayout(2, 1));
		this.setSize(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.inicializarVista();
		this.setVisible(true);

	}

	public void inicializarVista() {

		this.contenedor = new JPanel();

		this.titulo = new JLabel("Ingrese un dígito: ");
		contenedor.add(this.titulo);
		
		this.tDigito = new JTextField(10);
		contenedor.add(this.tDigito);

		this.registro = new JButton("Registrar número.");
		contenedor.add(this.registro);



		this.dRegistro = new JPanel();
		this.resultado = new JLabel("");

		dRegistro.add(this.resultado);

		this.add(this.contenedor);

		this.add(this.dRegistro);
	}

	public void resultadoCorrecto(String message) {
		JOptionPane.showMessageDialog(null, message, "Información", 1);

	}

	public void resultadoErroneo() {
		JOptionPane.showMessageDialog(null, "Número erroneo, intente de nuevo", "Error", 2);
	}

	public JPanel getContenedor() {
		return contenedor;
	}

	public void setContenedor(JPanel contenedor) {
		this.contenedor = contenedor;
	}

	public JButton getRegistro() {
		return registro;
	}

	public void setRegistro(JButton registro) {
		this.registro = registro;
	}

	public JPanel getDregistro() {
		return dRegistro;
	}

	public void setDregistro(JPanel dregistro) {
		dRegistro = dregistro;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JTextField gettDigito() {
		return tDigito;
	}

	public void settDigito(JTextField tDigito) {
		this.tDigito = tDigito;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void setResultado(JLabel resultado) {
		this.resultado = resultado;
	}


}