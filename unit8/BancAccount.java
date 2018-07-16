package com.epam.ias.account;

import java.util.*;
//import java.text.*;

public class BancAccount {
	public static void main(String[] args) {
		
		Date currDate = new Date();
		
	    System.out.println(currDate.toString());
		
		CustomerAcc account1= new CustomerAcc("1212", "Andrei Linnik", "USD");
		System.out.println("account1 now " + currDate + " hashCode " + account1.hashCode()); 
		
		CustomerAcc account2= new CustomerAcc("1212", "Andrei Linnik", "USD");
		System.out.println("account2 now " + currDate + " hashCode " + account2.hashCode());
		
		account1.setOpenDate(currDate);
		System.out.println("account1 now " + currDate + " hashCode " + account1.hashCode()); 
		account2.setOpenDate(currDate);
		System.out.println("account1 now " + currDate + " hashCode " + account1.hashCode()); 
		
		if (account1.addMoney(100000, "USD")) {
			System.out.println("account1 10000 USD added , hashCode " + account1.hashCode());
		}
		if (account2.addMoney(100000, "USD")) {
				System.out.println("account2 10000 USD added , hashCode " + account2.hashCode()); 
		}
		
		if (account1.minusMoney(10, "USD")) {
			System.out.println("account1 10 USD deducted  , hashCode " + account1.hashCode());
		}
		if (account2.minusMoney(10, "USD")) {
				System.out.println("account2 10 USD deducted  , hashCode " + account2.hashCode()); 
		}
		
		System.out.println("Is account1 equals to account2: " + account1.equals(account2)); 
		
		//Payment
		
		Payment order1= new Payment();
		
		Item prod1 = new Item ("Nissan Quashqai", 22000.00);
		Item prod2 = new Item ("Nissan pack1", 1500.00);
		Item prod3 = new Item ("Cognag", 200.00);
		
		order1.add(prod1);
		order1.add(prod2);
		order1.add(prod3);
		
		System.out.println("Currently in basket goods total sum:  " + order1.totalamount()); 
		if (account1.minusMoney (order1.totalamount(), "USD")) {
			System.out.println("account1 " + order1.totalamount() + " USD deducted " ); 
		}
		System.out.println("Details on account1 BankAccout after Payment " + account1.toString()); 
		
	
	}
}
