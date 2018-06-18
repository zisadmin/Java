package by.epam.bss.part2;

import java.util.Scanner;

public class lesson0402 {
	public static void main(String[] args) {
		int k=1,  sum=0;
		
		int[] mas;
		mas = new int[7];
		mas[0] = 26;
		mas[1] = 25;
		mas[2] = 43;
		mas[3] = 58;
		mas[4] = 67;
		mas[5] = 89;
		mas[6] = 202;
		
		System.out.println("Введите коэффициент кратности k" );
						
		k=readIntX("k");
		
				
		for (int i=0; i < mas.length; i++)
				{
			
			if (mas[i]%k == 0) {
				sum = sum + mas[i];
				System.out.println("Элемент массива mas[" + i + "]=" + mas[i] +" кратен " + k); 
				}
			
		}
		
		System.out.println("Сумма элементов массива mas кратных " + k + " равна " + sum); 
		
	}
		
		
		
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
