package co.edu.unbosque.model;

public class Lectura {

	String numeros;
	
	int []digitos=new int[4]; 
	
	public void  leerdigito (int digito) {
		
		if(digito==9 || digito==6 || digito==0 || digito==1) {
			for(int i=0;i<digitos.length;i++) {
				if(digitos[i]==digito) {
					
					
				}else if(i==3) {
					if(digito==9) {
						digitos[0]=9;
					}
					if(digito==6) {
						digitos[1]=6;
					}
					if(digito==0) {
						digitos[2]=0;
					}
					if(digito==1) {
						digitos[3]=1;
					}
					
				}
			}
		}
	}
	
	public boolean verificarCifra() {
		
		
			if(digitos[0]==9 && digitos[1]==6 && digitos[2]==0 && digitos[3]==1) {
				return true;
			}else return false;
			
			
		}
	public boolean comprobarDigito(int digito) {
		
		 if(digito!=9 && digito!=6 && digito!=0 && digito!=1) {
			return true;
		 }else return false;
		
	}
	
		
	
	
	
}