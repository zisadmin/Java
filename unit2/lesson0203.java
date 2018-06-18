package by.epam.bss.part2;

import java.util.Scanner;


public class lesson0203 { 
	public static void main(String[] args) {
		float r=0;
		float s=0;
		float l=0;
		double pi=3.14;
		float p=0;
				
		System.out.println("Ведите радиус окружности R=");
		r = readFloatX("r");
	
		p = (float) pi;
	
		s = p * r * r;
		l = 2 * p * r;
	
	System.out.println("Площадь круга S=" + s + ";\nДлина окружности L=" + l +";\n");
} 


	public static float readFloatX(String c) {
		float x;
		System.out.println("Введите " + c + ":");
		Scanner scx = new Scanner(System.in);
			while (!scx.hasNextFloat()) {
				System.out.println("Введите " + c + ":");
			scx.next();				
			}
		x=scx.nextFloat();
		return x;
	}

}
