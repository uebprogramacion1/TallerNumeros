package unbosque.edu.co.view;

import javax.swing.JOptionPane;
import unbosque.edu.co.model.Lectura;

public class Vista {
	Lectura Ca = new Lectura();

	public String ingresoDeDatos() {
		if (Ca.isControl() == true) {

			String a = Ca.getDigito();
			do {
				a = JOptionPane.showInputDialog("Ingrese Digitos");

			} while (JOptionPane.showConfirmDialog(null, "¿Introducir mas datos?", "Elija opcion",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
			return a;

		}
		return ingresoDeDatos();
	}

}
