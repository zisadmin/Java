package com.epam.ias.astud; 

public class StudentAnalyse {
	public static double averageScore(Student stud) {
		double scor;
		scor=(stud.getPhisics()+stud.getMatematics()+stud.getProgramming())/3;
		return scor;
	}
	
	public static StudentTypes studentType (Student stud) {
		StudentTypes  stp=StudentTypes.Отличник;
		
		if (averageScore(stud)==5) {
			stp=StudentTypes.Отличник;			
		}
		
		if (averageScore(stud)<5 && averageScore(stud)>=4) {
			stp=StudentTypes.Хорошист;			
		}
		
		if (averageScore(stud)<4) {
			stp=StudentTypes.Троечник;
		}
		if (stud.getMatematics()==2 || stud.getPhisics()==2 || stud.getProgramming()==2) {
			stp=StudentTypes.Двоечник;
		}
		
		return stp;
	}

}
