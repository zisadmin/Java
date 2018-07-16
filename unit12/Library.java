package com.epam.ias.book;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Books> tbooks = new ArrayList<Books>();
	
	public Library() {
	}

	public boolean add(Books e) {
		return tbooks.add(e);
	}

	public boolean remove(Books e) {
		return tbooks.remove(e);
	}

	public List<Books> getTbooks() {
		return tbooks;
	}

	public void setTbooks(List<Books> tbooks) {
		this.tbooks = tbooks;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tbooks == null) ? 0 : tbooks.hashCode());
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
		Library other = (Library) obj;
		if (tbooks == null) {
			if (other.tbooks != null)
				return false;
		} else if (!tbooks.equals(other.tbooks))
			return false;
		return true;
	}
	
	
	

	
	

	
	

}
