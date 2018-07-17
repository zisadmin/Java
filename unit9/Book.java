package com.epam.ias.book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Book {
	public static void  main (String args []) {
		// For Unit 9
		 List<Books> books = new ArrayList<Books>();
		    TechBook mybook1 = new TechBook("Java", "Unknown", 1980, 1, Difficulty.Easy);
			FictionBook mybook2 = new FictionBook("Ten Little Indians", "Agata Christy", 1970, 2, Style.Detective);
			HumanBook mybook3 = new HumanBook("Basic Theology", "A.Osipov", 1998, 1, Belonging.Religion);
			
			books.add(mybook1);
			books.add(mybook2);
			books.add(mybook3);
			
			
			 for (Books items : books) {
				items.printBook();
			 }
			//  end of For Unit 9
		
		
		String libFile = "c:\\_Work_\\_Lib_Data\\Library.txt";
		Library homeLibrary = new Library();
			
		BufferedReader br = null;
		String strFromFile = "";
		String SplitChar = "|";
		Difficulty diff;
		Style stl;
		Belonging blg;
		
		 
		 try {
			    

				br = new BufferedReader(new FileReader(libFile));
				while ((strFromFile = br.readLine()) != null) {

					// use | as separator
					String[] strSpl = strFromFile.split(SplitChar);
										
					if (strFromFile.substring(0,1) =="T") {
						switch (strSpl[5]) {
						case "Easy": diff=Difficulty.Easy;
									break;
						case "Medium": diff=Difficulty.Medium;
									break;
						case "Hard":diff=Difficulty.Hard;
									break;
						default:	diff=Difficulty.Easy;
									break;
						}
						homeLibrary.add(new TechBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]),diff ));
						}
					
					if (strFromFile.substring(0,1) =="H") {
						switch (strSpl[5]) {
						case "Religion": blg=Belonging.Religion; 
								break;
						case "Philosophy": blg=Belonging.Philosophy; 
								break;
						case "Psychology": blg=Belonging.Psychology; 
								break;
						default:			blg=Belonging.Religion;
								break;
						}
						homeLibrary.add(new HumanBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]), blg));
						}
					
					if (strFromFile.substring(0,1) =="F") {
						switch (strSpl[5]) {
						case "Detective": stl=Style.Detective; 
								break;
						case "Novel": stl=Style.Novel; 
								break;
						case "Memoir": stl=Style.Memoir; 
								break;
						default: 		stl=Style.Detective;
								break;
						}
						homeLibrary.add(new FictionBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]), stl));
						}
				
					
					 for (Books item : homeLibrary.getTbooks()) {
							System.out.println("forr main");
							item.printBook();
						}
					 
					
					}//while
				

			} catch (FileNotFoundException e) {
				System.out.println("Import file does not exist");
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println(" Import file's format is not correct");
				e.printStackTrace();
			}
			 catch (IOException e) {
					e.printStackTrace();
			}
			finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}		 
		    
	
	}
}
