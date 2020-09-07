package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista {
	
	public Vista() {

	}

	public void imprimirMensaje(String m) {
		JOptionPane.showMessageDialog(null, m);
	}

	public int capturarDato(String m) {
		int digito = 0;
		String aux = JOptionPane.showInputDialog(m);
		digito = Integer.parseInt(aux);
		
		return digito;
	}

}
