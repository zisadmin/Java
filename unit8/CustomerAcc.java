package com.epam.ias.account;

import java.util.*;

public class CustomerAcc {
	private String name;
	private String number;
	private String currency;
	private Double total;
	private Date openDate;
	
	public CustomerAcc(String name, String number, String currency) {
		this.name=name;
		this.number=number;
		this.currency=currency;
		this.total=0.0;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		CustomerAcc other = (CustomerAcc) obj;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}






	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public String getName() {
		return name;
	}
	
	
	public boolean addMoney(double delta, String currency) {
		if (this.currency.contentEquals(currency)) {
			this.total = this.total + delta;
			return true;
		} else {
			return false;
		}
	}

	public boolean minusMoney(double delta, String currency) {
		if (this.currency.contentEquals(currency)) {
			this.total = this.total - delta;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
	return "Account [" + number + "], " + name + ", " + total + " "+ currency + ".";
	}

}
