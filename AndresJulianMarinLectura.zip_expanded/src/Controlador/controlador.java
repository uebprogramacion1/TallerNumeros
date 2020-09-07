// es el conector entre el modelo y la vista,  da las instrucciones cuando carga  el formulario, que accion tienen el boton valida y mostrar el resutado
// y excepcion de caracteres diferentes

package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.modelo;
import Vista.vista;

public class controlador implements ActionListener{  //Implementa la accion del boton

	private vista view;  //Controla la vista
	private modelo model;  //Controla el modelo
	
	public controlador(vista view, modelo model) {  // Constructor recibe Vista y Modelo
		 this.view = view;
		 this.model = model;
		 this.view.btnAceptar.addActionListener(this);  //Boton del formulario recibe comandos
	}
	
	public void iniciar() {
		view.setTitle("MVC Validar Numero");  // Asigna el titulo de la ventana
		view.setLocationRelativeTo(null);     // Centrar la ventana
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {  //Acciones del boton del formulario
		// TODO Auto-generated method stub
		try {
			model.setNumeroUno(Integer.parseInt(view.txtObjetivo.getText()));  //Extrae el entero del formulario
			model.setNumeroDos(Integer.parseInt(view.txtTexto.getText()));  //Convierte el texto a entero
			model.Validar();  //Funci�n para contar coincidencias
			
			//Devuelve los numeros rellenando con 0 para completar 4 digitos
			view.txtObjetivo.setText(String.format("%1$4s",String.valueOf(model.getNumeroUno())).replace(' ','0'));
			view.txtTexto.setText(String.format("%1$4s",String.valueOf(model.getNumeroDos())).replace(' ','0'));
			
			//Indica cuantas coincidencias encontro
			view.lblResultado.setText(String.valueOf(model.getResultado()) + " digitos diferentes");
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			view.lblResultado.setText("Error en los datos!!");
		}
	}
}
