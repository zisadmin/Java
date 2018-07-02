package com.epam.ias.astud;

public class Student {
	private String name;
	private int matematics;
	private int phisics;
	private int programming;
	
	
	public Student(String name, int matematics, int phisics, int programming){
		this.name=name;
		this.matematics=matematics;
		this.phisics=phisics;
		this.programming=programming;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMatematics() {
		return matematics;
	}


	public void setMatematics(int matematics) {
		this.matematics = matematics;
	}


	public int getPhisics() {
		return phisics;
	}


	public void setPhisics(int phisics) {
		this.phisics = phisics;
	}


	public int getProgramming() {
		return programming;
	}


	public void setProgramming(int programming) {
		this.programming = programming;
	}



}
