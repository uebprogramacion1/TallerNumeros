package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarResultados(int dato) {
		JOptionPane.showMessageDialog(null, dato);
	}
	
	
	public int pedirDato() {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Entre Digito:"));
		return numero;
	}
}
