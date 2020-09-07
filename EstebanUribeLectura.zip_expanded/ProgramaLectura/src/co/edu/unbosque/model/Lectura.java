package co.edu.unbosque.model;

public class Lectura {
	
	int digito;
	int dig9;
	int dig6;
	int dig0;
	int dig1;
	
	public Lectura() {
		
		digito = 0;
		
	}
	
	public int leerDigitos(int digito) {
		
		int ld = 0;
		
		if (digito==9) {
			dig9=9000;
		}else if (digito==6) {
			dig6=600;
		}else if (digito==0) {
			dig0=0;
		}else if (digito==1) {
			dig1=1;
		}
		ld = dig9 + dig6 + dig0 + dig1;
		return ld;
	}
	
	public int contarDigitos(int digito) {
		
		int r = 0;
		
		while(digito!=9 && digito!=6 && digito!=0 && digito!=1) {
			digito = 1;
			r++;
		}
		return r;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}
	


	
	

}
