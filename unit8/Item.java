package com.epam.ias.account;

public class Item {

	private String itemName;
	private double price;

	public Item(String itemName, double price){
	this.itemName = itemName;
	this.price = price;
	}
	public String getItemname() { return itemName; }
	public void setItemname(String itemName) { this.itemName = itemName; }
	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	

}
