package Vista;

//aca creo etiquetas, cuadros de texto y boton validar

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class vista extends JFrame {   // Se crea el formulario
	public JLabel lblObjetivo, lblTexto, lblResultado;  //Etiquetas de texto
	public JTextField txtObjetivo, txtTexto;   //Cuadros de texto
	public JButton btnAceptar;    //Boton de comandos
	JPanel panel;      //Panel para organizar los objetos
	
	public vista () {
		lblObjetivo = new JLabel("Numero Objetivo: ");   //Etiqueta del numero uno
		lblObjetivo.setBounds(20, 50, 180, 20);   //Ubicacion
		
		lblTexto = new JLabel("Numero a Probar: ");    //Etiqueta del numero dos
		lblTexto.setBounds(20, 100, 180, 20);    //Ubicacion
		
		lblResultado = new JLabel("Compare los numeros...");  //Etiqueta de resultados
		lblResultado.setBounds(20, 200, 180, 20);    //Ubicacion
		
		txtObjetivo = new JTextField(4);  // Numero de referencia uno
		txtObjetivo.setBounds(140, 50, 80, 20);  //Ubicacion
		txtObjetivo.addKeyListener(new KeyAdapter()  //Restringe a 4 digitos
		{
		   public void keyTyped(KeyEvent e)
		   {
		      char caracter = e.getKeyChar();

		      // Verificar si la tecla pulsada no es un digito
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*corresponde a BACK_SPACE*/))
		      {
		         e.consume();  // ignorar el evento de teclado
		      }
		      if (txtObjetivo.getText().length()==4) e.consume();  //Limita los caracteres 
		   }
		});
		
		txtTexto = new JTextField(4);  // Numero de prueba
		txtTexto.setBounds(140, 100, 80, 20);  //Ubicacion
		txtTexto.addKeyListener(new KeyAdapter()   //Restringe a 4 digitos
		{
		   public void keyTyped(KeyEvent e)
		   {
		      char caracter = e.getKeyChar();

		      // Verificar si la tecla pulsada no es un digito
		      if(((caracter < '0') ||
		         (caracter > '9')) &&
		         (caracter != '\b' /*corresponde a BACK_SPACE*/))
		      {
		         e.consume();  // ignorar el evento de teclado
		      }
		      if (txtTexto.getText().length()==4) e.consume();  //Limita los caracteres
		   }
		});
		
		btnAceptar = new JButton("Validar");   //Boton de validacion
		btnAceptar.setBounds(140, 150, 80, 20);  //Ubicacion
		
		panel = new JPanel();   //"Modelo - Vista - Controlador"
		panel.setLayout(null);
		
		panel.add(lblObjetivo);   //Agrega los elementos al panel
		panel.add(lblTexto);
		panel.add(txtObjetivo);
		panel.add(txtTexto);
		panel.add(btnAceptar);
		panel.add(lblResultado);
		add(panel);  //Inserta el panel en el formulario
		setSize(400, 300);  //Tamano del formulario
		//setTitle("Modelo - Vista - Controlador");
		//setVisible(true);
	}
	
	
}
