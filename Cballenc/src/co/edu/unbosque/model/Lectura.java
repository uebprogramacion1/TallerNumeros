package co.edu.unbosque.model;

public class Lectura {

	private int digito;
	private int contador;
	private boolean d9;
	private boolean d6;
	private boolean d0;
	private boolean d1;
	
	
	public Lectura() {
		digito = 0;
		contador=0;
		d9=false;
		d6=false;
		d0=false;
		d1=false;
	}
	

	public int validarCifra(int dato) {
		int c=0;
		
		while (d9==false && d6==false && d0==false && d1==false) {
			c=validarDiferente(dato);
			if(c!=0) {
				contador++;
			} 
			else if (dato==9){
				d9=true;
				}
			else if (dato==6) {
				d6=true;
			}
			else if (dato==0){
				d0=true;
			}
			else if (dato==1) {
				d1=true;
			}
		}	
				
		return contador;
	}
	
	public int validarDiferente(int dato){
		
		int esDif=0;
		if(dato!=9 && dato!=6 && dato!=0 && dato!=1) {
			esDif++;
		}
		return esDif;
	}
	
	
	
	
	
	
	public int getDigito() {
		return digito;
	}
	
	public void setDigito(int d) {
		this.digito = d;
	}
	
}
