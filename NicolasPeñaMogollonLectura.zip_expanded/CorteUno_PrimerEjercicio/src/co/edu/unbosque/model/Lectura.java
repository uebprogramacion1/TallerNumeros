package co.edu.unbosque.model;

public class Lectura {

	private final String NUMERO_FIJO;
	private String numero;
	private int contador;

	public Lectura() {
		this.NUMERO_FIJO = "9601";
		this.contador = 0;
		this.numero = NUMERO_FIJO;
	}

	public String validarDigito(String pDigito) {
		if (this.NUMERO_FIJO.contains(pDigito)) {
			this.setNumero(this.numero.replace(pDigito, ""));
			return "Bien!!!";

		} else {
			this.aumentarContador();
			return "Intenta de nuevo :(";
		}
	}

	public void aumentarContador() {
		this.contador += 1;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public String getNUMERO_FIJO() {
		return NUMERO_FIJO;
	}

}
