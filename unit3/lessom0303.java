package by.epam.bss.part2;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class lessom0303 {
	public static void main(String [] args) {
		double Fx=0, x;
		
		x=readDoubleX("x");
		Fx=calcFx(x);
		System.out.println("Значение фунции F(" + x + ")=" + Fx);
		
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
	
	public static double calcFx(double f) {
		double res=0;
		if (f <= -3) {
			res=9;
		}
		else {if (f > 3) {
			res=1/(f*f+1);
				}
				else { 
					System.out.println("Фунция не определена в данной точке");
													}
				}
		return(res);
		}
}