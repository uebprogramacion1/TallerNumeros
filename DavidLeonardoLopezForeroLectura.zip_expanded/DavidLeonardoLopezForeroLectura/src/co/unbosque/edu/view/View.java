package co.unbosque.edu.view;

import javax.swing.JOptionPane;

public class View {

	public View() {

	}

	public void imprimirMensaje(String m) {
		JOptionPane.showMessageDialog(null, m);

	}

	public int capturarN�meros(String m) {
		
		int resultado = 0;
		String aux = JOptionPane.showInputDialog(m);

		while (esN�mero(aux) == false) {
			imprimirMensaje("Se�or usuario digite un valor valido");
			aux = JOptionPane.showInputDialog(m);

		}

		while (Integer.parseInt(aux) < 0) {
			imprimirMensaje("Se�or usuario digite n�mero positivo");
			aux = JOptionPane.showInputDialog(m);

		}
		resultado = Integer.parseInt(aux);

		return resultado;

	}

	public boolean esN�mero(String m) {
		try {
			Integer.parseInt(m);
			return true;
		} catch (NumberFormatException nfe) {

			return false;

		}
	}
}
