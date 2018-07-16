package com.epam.ias.account;

import java.util.List;
import java.util.ArrayList;

public class Payment {
	private List<Item> items = new ArrayList<Item>();

	public Payment() {
	}

	public List<Item> getItems() {
		return items;
	}

	public void add(Item item) {
		items.add(item);
	}

	public boolean delete(Item item) {
		return items.remove(item);
	}

	public Item findByName(String itemname) {
		for (Item item : items) {
			if (item.getItemname().equals(itemname)) {
				return item;
			}
		}
		return null;
	}

	public double totalamount() {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.getPrice();
		}
		return sum;
	}

}
