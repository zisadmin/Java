package by.epam.bss.frac1;

import java.util.Date;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
				
		System.out.println("Введите размерность массива");
		
		int ns = readX.readIntX("ns");
		Fraction[] mas = new Fraction[ns];
				
		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
			int n, d;
			n = rand.nextInt(100);
			d = rand.nextInt(100);
			mas[i] = new Fraction(n, d);
			
		}
		
		
		FractionAction action = new FractionAction();
		for(int i=0; i<mas.length; i++) {
			FractionFormatter.format(mas[i]);
			action.sokr(mas[i]);
			FractionFormatter.format(mas[i]);
		}
		
	//	Fraction f3;
	//	f3 = action.add(mas[0], mas[1]);
		
	//	FractionFormatter.format(f3);
	//	action.sokr(f3);
	//	FractionFormatter.format(f3);

	}


}
