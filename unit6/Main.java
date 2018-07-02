package com.epam.ias.astud; 

public class Main {
	public static void main(String[] args) {
		double groupAverageScore=0;
		int numberStudents=6;
		//Student[] students= new Student [4];
		Group group = new Group(numberStudents);
		
		group.students [0] = new Student("Иванов",5,5,5);
		group.students [1] = new Student("Петров",5,5,5);
		group.students [2] = new Student("Сидоров",3,4,4);
		group.students [3] = new Student("Васечкин",2,4,4);
		group.students [4] = new Student("Пупкин",2,4,4);
		group.students [5] = new Student("Зубкин",5,4,4);

		
		
		GroupAnalyse.studentsStatistic(group);
		GroupAnalyse.groupeRate(group);
		GroupAnalyse.groupStatistic(group);

	}


}
