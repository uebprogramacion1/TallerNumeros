package co.unbosque.edu.view;

import javax.swing.JOptionPane;

public class View {

	public View() {

	}

	public void imprimirMensaje(String m) {
		JOptionPane.showMessageDialog(null, m);

	}

	public int capturarNúmeros(String m) {
		
		int resultado = 0;
		String aux = JOptionPane.showInputDialog(m);

		while (esNúmero(aux) == false) {
			imprimirMensaje("Señor usuario digite un valor valido");
			aux = JOptionPane.showInputDialog(m);

		}

		while (Integer.parseInt(aux) < 0) {
			imprimirMensaje("Señor usuario digite número positivo");
			aux = JOptionPane.showInputDialog(m);

		}
		resultado = Integer.parseInt(aux);

		return resultado;

	}

	public boolean esNúmero(String m) {
		try {
			Integer.parseInt(m);
			return true;
		} catch (NumberFormatException nfe) {

			return false;

		}
	}
}
