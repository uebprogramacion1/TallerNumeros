// este es la clase ejecutable que llama los otros como modelo vista etc

package MVC;

import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;

public class mvc {  //  Modelo - Vista - Controlador

	public static void main (String[] args) {
		
		modelo mod = new modelo();  //Modelo con la logica y funciones
		vista view = new vista();   //Interfaz con el usuario formulario
		controlador ctrl = new controlador(view, mod);  //Comunicacion
		
		ctrl.iniciar();  //Lanza el formulario controlado
		view.setVisible(true);  //Muestra el formulario
		view.txtObjetivo.setText("9601");  //Numero a comparar por defecto
		view.txtTexto.grabFocus();  //Coloca el foco en el segundo texto
	}
}
