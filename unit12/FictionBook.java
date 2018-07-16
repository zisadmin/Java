package com.epam.ias.book;

public class FictionBook extends Books{
	Style style;

	public FictionBook(String title, String author, int yearPublished, int number, Style style) {
		super(title, author, yearPublished, number);
		this.style = style;
		// TODO Auto-generated constructor stub
	}

	public Style getStyle() {
		return style;
	}


	@Override
	public void printBook() {
		System.out.println("Title of Fiction book:" + getTitle() + " Author:" + getAuthor() +
				" Year of Published:" + getYearPublished()+" Number of books:" + getNumber()+
				" Style:" + getStyle()
				);
	}
	
	

}
