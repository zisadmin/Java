package by.epam.bss.frac1;

import java.util.Scanner;

public class readX {
	public static int readIntX(String c) {
		int x;
		System.out.println("Введите " + c + ":");
		Scanner scx = new Scanner(System.in);
			while (!scx.hasNextInt()) {
				System.out.println("Введите " + c + ":");
			scx.next();				
			}
		x=scx.nextInt();
		return x;
	}
	

}
