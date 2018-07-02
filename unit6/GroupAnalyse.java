package com.epam.ias.astud; 

public class GroupAnalyse {
	public static void groupeRate(Group grp) {
		double rate=0;
		for (int i=0; i<grp.getStudents().length; i++) {
			rate=rate+StudentAnalyse.averageScore(grp.students[i]); // сумма средних баллов
		}
		//return (rate/grp.getStudents().length);
		System.out.println("Средний балл группы: " + (rate/grp.getStudents().length));
	}
	
	
	public static void groupStatistic (Group grp) {
		int otl=0;
		int hor=0;
		int ud=0;
		int neud=0;
		StudentTypes studType;
		
		for (int i=0; i<grp.getStudents().length; i++) {
			studType=StudentAnalyse.studentType(grp.students[i]);
			
			switch (studType) {
			case Отличник:
				otl++;				
				break;
			case Хорошист:
				hor++;
				break;
			case Троечник:
				ud++;
				break;
			case Двоечник:
				neud++;
				break;			
			}
			 
		}
		
		System.out.println("В группе:" + "\nОтличников: " + otl +"\nХорошистов: "+hor+
				"\nТроечников: " + ud + "\nДвоечников: " + neud);
		
	}
	
	public static void studentsStatistic (Group grp) {
		for(int i=0; i<grp.getStudents().length; i++) {
			System.out.println("Студент\t " + grp.students[i].getName()+
								":\t математика "+ grp.students[i].getMatematics()+ 
								"; физика "+ grp.students[i].getPhisics()+ 
								"; программирование " + grp.students[i].getProgramming()+
								"; средний балл " + StudentAnalyse.averageScore(grp.students[i]) +
								" " + StudentAnalyse.studentType(grp.students[i]) );
		}
		
	}

}
