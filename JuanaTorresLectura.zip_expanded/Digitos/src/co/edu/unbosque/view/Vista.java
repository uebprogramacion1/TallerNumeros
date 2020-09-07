package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista {
	
	public Vista () {
		
	}
	
	public int capturarDato (String m) {
		int resultado=0;
		String aux=JOptionPane.showInputDialog(m);
		resultado=Integer.parseInt(aux);
		return resultado;
	}
	
	public  void imprimirMensaje(String m){
        JOptionPane.showMessageDialog( null , m );
    }

    public void imprimirMensajeError(String m){
        JOptionPane.showMessageDialog( null, m ,"Mensaje error", JOptionPane.WARNING_MESSAGE );

    }

}

