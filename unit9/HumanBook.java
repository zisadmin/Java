package com.epam.ias.book;

public class HumanBook extends Books{
	Belonging belonging;

	public HumanBook(String title, String author, int yearPublished, int number, Belonging belonging) {
		super(title, author, yearPublished, number);
		this.belonging=belonging;
		// TODO Auto-generated constructor stub
	}

	public Belonging getBelonging() {
		return belonging;
	}

	
	@Override
	public void printBook() {
		System.out.println("Title of human book " + getTitle() + " Author:" + getAuthor() +
				" Year of Published:" + getYearPublished()+" Number of books:" + getNumber()+
				" Belonging:" + getBelonging()
				);
	}
	
	

}
