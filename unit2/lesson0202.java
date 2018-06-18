package by.epam.bss.part2;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class lesson0202 {
	public static void main(String[] args) {
		double a,b,c,d, Fx=0;
		
		System.out.println("Введите три числа " );
		a=readDoubleX("a");
		b=readDoubleX("b");
		c=readDoubleX("c");
		d=b*b+4*a*c;
		
		if (a != 0 ) {
			if (d >= 0){
				Fx=((b+Math.sqrt(d))/(2*a)) - a*a*a*c + b;
				System.out.println("Значение фукции Fx=" + Fx);
			}
			else {
				System.out.println("Выражение не имеет смысла потому что подкоренное выражение <0 ");				
			}
		}
		else {
			System.out.println("Выражение не имеет смысла потому что знаменатель=0 ");
		}
	}
	
	public static double readDoubleX(String c) {
		double x;
		System.out.println("Введите " + c + ":");
		Scanner scx = new Scanner(System.in);
			while (!scx.hasNextDouble()) {
				System.out.println("Введите " + c + ":");
			scx.next();				
			}
		x=scx.nextDouble();
		return x;
	}
}
