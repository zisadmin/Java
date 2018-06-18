package by.epam.bss.part2;

import java.util.Scanner;

public class lesson03 {
	public static void main (String[] args) {
		double a,b,c,d,s;
		
		System.out.println("Введите четыре числа a,b,c,d");
		a=readDoubleX("a");
		b=readDoubleX("b");
		c=readDoubleX("c");
		d=readDoubleX("d");
		
		s=a+b+c+d;
		
		System.out.println("Сумма четрырех слагаемых s=" + s);
		
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
