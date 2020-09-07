package unbosque.edu.co.controller;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import unbosque.edu.co.model.Lectura;
import unbosque.edu.co.view.Vista;

public class AplMain {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			
		}catch (UnsupportedLookAndFeelException e) {
			
		}catch(ClassNotFoundException e) {
			
		}catch(InstantiationException e) {
			
		}catch(IllegalAccessException e) {
			
		}
		AplMain a = new AplMain();
	}
}
