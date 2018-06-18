package by.epam.bss.part2;

import java.util.Scanner;

public class lesson02 {
	public static void main (String[] args) {
		double a,b,c,s;
		
		System.out.println("Введите катеты прямоугльного треугольника a и b");
		a=readDoubleX("a");
		b=readDoubleX("b");
		
		c=Math.sqrt((a*a+b*b));
		
		s=0.5*a*b;
		
		System.out.println("Прямоугольный треугольник с катетами a=" + a + "; b=" + b 
				+ ";\nимеет гипотенузу с=" + c + "; и площадь s=" + s +";");
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
