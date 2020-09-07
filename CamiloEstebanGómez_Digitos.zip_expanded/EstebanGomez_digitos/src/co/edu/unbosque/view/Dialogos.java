package co.edu.unbosque.view;

import java.io.InputStream;

import javax.swing.JOptionPane;

public class Dialogos {
public String input(InputStream input, String titulo, String mensaje) {
	return JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE);
	
}
public void output (String titulo, String mensaje ){
	JOptionPane.showMessageDialog(null,mensaje,titulo,JOptionPane.PLAIN_MESSAGE);
}

}
