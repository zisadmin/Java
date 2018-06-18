package by.epam.bss.frac1;

public class FractionFormatter {
	public static void format(Fraction fr) {
		System.out.println(fr.getNum() +"/"+ fr.getDen());
	}

	
	public static void format(Fraction fr, String symbolBegin, String symbolEnd) {
		System.out.println(symbolBegin + fr.getNum() +"/"+ fr.getDen() + symbolEnd);
	}


}
