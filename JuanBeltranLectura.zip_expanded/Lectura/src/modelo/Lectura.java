package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lectura {

	// 9601

	public static void main(String[] args) {

		int total = 0;
		int digito = 0;

		while (digito != 9) {

			digito = Integer.parseInt(JOptionPane.showInputDialog("Escriba el primer digito"));

			while (digito != 9) {

				digito = Integer.parseInt(JOptionPane.showInputDialog("Intente de nuevo. Escriba el primer digito"));
				total++;

			}
			if (digito == 9) {

				System.out.println("Ha acertado");

			}
		}
		while (digito != 6) {

			digito = Integer.parseInt(JOptionPane.showInputDialog("Escriba el segundo digito"));

			while (digito != 6) {
				digito = Integer.parseInt(JOptionPane.showInputDialog("Intente de nuevo. Escriba el segundo d�gito"));

				total++;
			}

			if (digito == 6) {

				System.out.println("Ha acertado");
			}

		}

		while (digito != 0) {

			digito = Integer.parseInt(JOptionPane.showInputDialog("Escriba el tercer d�gito"));

			while (digito != 0) {
				digito = Integer.parseInt(JOptionPane.showInputDialog("Intente de nuevo. Escriba el tercer d�gito"));

				total++;
			}
			if (digito == 0) {

				System.out.println("Ha acertado");
			}

		}

		while (digito != 1) {

			digito = Integer.parseInt(JOptionPane.showInputDialog("Escriba el �ltimo d�gito"));

			while (digito != 1) {
				digito = Integer.parseInt(JOptionPane.showInputDialog("Intente de nuevo. Escriba el �ltimo d�gito"));

				total++;
			}
			if (digito == 1) {

				System.out.println("Ha acertado");
				System.out.println("El total de n�meros diferentes a los d�gitos de la cifra 9601 es: " + total);
			}
		}

	}

}