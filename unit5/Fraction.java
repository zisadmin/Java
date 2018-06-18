package by.epam.bss.frac1;

public class Fraction {
	private int num;// =0
	private int den;// =0

	public Fraction(int num, int den) {
		if(den == 0) { den = 1; }
		this.num = num;
		this.den = den;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setDen(int den) {
		if(den == 0) { den = 1; }
		this.den = den;
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		if(!(this.getClass() == obj.getClass())) {
			return false;
		}
		
		Fraction fr = (Fraction) obj;
		
		if(num != fr.num) {
			return false;
		}
		
		if(den != fr.den) {
			return false;
		}
		
		
		return true;
	}


}
