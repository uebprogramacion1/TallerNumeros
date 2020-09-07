package co.edu.unbosque.model;

public class Lectura {

	private String num = "9601";
	private int cont = 0;

	public String ingresarNum(String nDig) {
		String num1 = "";
		boolean comp = true;
		for (int k = 0; k < this.num.length(); k++) {
			if (nDig.equals(this.num.substring(k, k + 1))) {
				num1 = this.num.replaceAll(nDig, "");
				comp = false;
				k = this.num.length() + 1;

			}
		}

		if (comp) {
			aumentarCont();
			return "Error, intenta de nuevo.";
		}
		setNum(num1);
		return "Felicidades";

	}

	public void aumentarCont() {
		this.cont++;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

}