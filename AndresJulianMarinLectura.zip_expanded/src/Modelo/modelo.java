
//aca creo la logica de la aplicacion, donde grabo numeros de comparacion y los ingresados por usuario y regresa la cantintidad de difernecia

package Modelo;

public class modelo {
	private int numeroUno;  //Modelo de 3 enteros, 2 entradas y 1 salida
	private int numeroDos;
	private int resultado;
	
	public int getNumeroUno() {  //Extrae el valor del numero uno
		return numeroUno;
	}
	
	public void setNumeroUno(int numeroUno) {  //Graba el valor del numero uno
		this.numeroUno = numeroUno;
	}
	
	public int getNumeroDos() {  //Extrae el valor del numero dos
		return numeroDos;
	}
	
	public void setNumeroDos(int numeroDos) {  //Graba el valor del numero dos
		this.numeroDos = numeroDos;
	}
	
	public int getResultado() {  //Extrae el valor del resultado
		return resultado;
	}
	
	public void setResultado(int resultado) {  //Graba el valor del resultado
		this.resultado = resultado;
	}
	
	public int Validar() {  //Funcion para contar las coincidencias
		int i = this.numeroUno;
		int j = this.numeroDos;
		int k = 0;  //Contador de digitos iguales
		
		if (i/1000 == j/1000) k++;  //Unidades de mil
		if (i/100 - i/1000*10 == j/100 - j/1000*10) k++;  //Centenas
		if (i/10 - i/100*10 == j/10 - j/100*10) k++;  //Decenas
		if (i - i/10*10 == j - j/10*10) k++;  //Unidades
		
		this.resultado = 4-k;  //Cantidad de diferencias capturadas
		return this.resultado;
	}
}
