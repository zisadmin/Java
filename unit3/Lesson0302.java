package by.epam.bss.part2;

import java.util.Scanner;

public class Lesson0302 {
	public static void main (String[] args) {
		
		double a,b,h,tm=0, counter, Fx=0;		

		System.out.println("Введите координаты отрезка [a,b]");
		a=readDoubleX("a");
		b=readDoubleX("b");		
		
		System.out.println("Введите интервал h:");
		h=readDoubleX("h");
		
		if (a>b)  { // если неправильно введны координаты
			tm=a;
			a=b;
			b=tm;
		} 
		
		counter=a; //расчет будет произведен в начальной точке отрезка
		
		System.out.println("-----------------------------------------");
		System.out.println("|      F(x)     |       значение        |");
		System.out.println("-----------------------------------------");
		
		while (counter<=b) { //расчет в начальной точке отрезка
			Fx=2 * Math.tan(counter/2)+1;
			System.out.println("|     F(" + counter + ")\t| " + Fx + "\t|"); 
			counter=counter+h;
			if (( counter > b) && (counter < (b +h)) ){ // расчет будет произведен в конечной точке отрезка
				counter=b;}				
		} 
		System.out.println("-----------------------------------------");
				
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
