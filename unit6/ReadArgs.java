package com.epam.ias.astud;

import java.util.Scanner;

public class ReadArgs {
	public  int readXint(String c) {
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

	public  double readXdouble(String c) {
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
	
	public  String readXstring(String c) {
		String x;
		System.out.println("Введите " + c + ":");
		Scanner scx = new Scanner(System.in);
		x=scx.nextLine(); ;
		return x;
	}
}
