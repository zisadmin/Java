package com.epam.ias.book;

public class Books {
	String title;
	String author;
	int yearPublished;
	int number;
	
	public Books(String title, String author, int yearPublished, int number) {
		super();
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	public void printBook() {
		System.out.println("Title:" + getTitle() + " Author:" + getAuthor() +
				" Year of Published:" + getYearPublished()+
				" Number of books:" + getNumber());
	}

}
