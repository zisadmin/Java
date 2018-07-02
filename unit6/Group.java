package com.epam.ias.astud; 

public class Group {
	//int numberOfStudents;
	Student[] students;
	
	public Group(int numberOfStudents) {
		students = new Student[numberOfStudents];
	/*	for (int i = 0; i < numberOfStudents; i++) {
			students[i] = new Student();
		}*/
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
}
