package by.epam.bss.frac1;

public class FractionAction {
	public void sokr(Fraction fr) {
		int nod = nod(fr);

		fr.setNum( fr.getNum() / nod );
		fr.setDen( fr.getDen() / nod );
	}
	
	
	public Fraction add(Fraction fr1, Fraction fr2) {
		int newNum;
		int newDen;
		
		newDen = fr1.getDen() * fr2.getDen();
		newNum = fr1.getNum()*fr2.getDen() + fr1.getDen()*fr2.getNum();
		
		Fraction addFr = new Fraction(newNum, newDen);
		
		return addFr;
	}
	
	
	private int nod(Fraction fr) {
		int nod;

		if(fr.getNum() == 0) {
			return 1;
		}
		
		if (fr.getNum() > fr.getDen()) {
			nod = fr.getDen();
		} else {
			nod = fr.getNum();
		}

		while (!((fr.getNum() % nod == 0) && (fr.getDen() % nod == 0))) {
			nod--;
		}

		return nod;

	}


}
