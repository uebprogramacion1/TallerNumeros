package co.edu.unbosque.model;

public class Lectura {
	
	private int num;
	private int b;
	private int c;
	private int f;
	private int e;
	
	public Lectura () {
	
		b=0;
		c=0;
		e=0;
		f=0;		
	    num =0;
	
	}

	
	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public int getF() {
		return f;
	}


	public void setF(int f) {
		this.f = f;
	}


	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
		
	public int contarDigitos (int d) {
		int r=0;
		if (d!=1&&d!=0&&d!=9&&d!=6) {
			r+=1;
		}
		return r;
	}
	
	public int compararDigitos (int d) {
		int r=0;
		
		if (d==1) {
			f=1;
		}else if (d==0) {
			b=1;
		}else if (d==6) {
			c=1;
		}else if (d==9) {
			e=1;
		}
		r=f+b+c+e;
		return r;
	}



}
