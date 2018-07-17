package com.epam.ias.book;

public class TechBook extends Books {
	Difficulty difficulty;

	public TechBook(String title, String author, int yearPublished, int number, Difficulty difficulty) {
		super(title, author, yearPublished, number);
		this.difficulty = difficulty;
		// TODO Auto-generated constructor stub
	}
	
	

	public Difficulty getDifficulty() {
		return difficulty;
	}

	
	
	@Override
	public void printBook() {
		System.out.println("Title of technician book:" + getTitle() + " Author:" + getAuthor() +
				" Year of Published:" + getYearPublished()+" Number of books:" + getNumber()+
				" Difficulty:" + getDifficulty()
				);
	}

}
