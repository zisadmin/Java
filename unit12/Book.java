package com.epam.ias.book;

import java.io.*;

public class Book {
	public static void  main (String args []) {
			
		
		String libFile = "c:\\_Work_\\_Lib_Data\\Library.txt";
		Library homeLibrary = new Library();
			
		BufferedReader br = null;
		String strFromFile = "";
		String SplitChar = ";";
		Difficulty diff;
		Style stl;
		Belonging blg;
		
		 
		 try {			    

				br = new BufferedReader(new FileReader(libFile));
				while ((strFromFile = br.readLine()) != null) {
					
					// use ; as separator
					String[] strSpl = strFromFile.split(SplitChar);
										
					if (strSpl[0].compareTo("T")==0 ) {
						switch (strSpl[5]) {
						case "Easy": diff=Difficulty.Easy;
									break;
						case "Medium": diff=Difficulty.Medium;
									break;
						case "Hard":diff=Difficulty.Hard;
									break;
						default:	diff=Difficulty.Medium;
									break;
						}
											
						homeLibrary.add(new TechBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]),diff ));
												
						}
					
					if (strSpl[0].compareTo("H")==0 ) {
						switch (strSpl[5]) {
						case "Religion": blg=Belonging.Religion; 
								break;
						case "Philosophy": blg=Belonging.Philosophy; 
								break;
						case "Psychology": blg=Belonging.Psychology; 
								break;
						default:			blg=Belonging.Psychology;
								break;
						}
						homeLibrary.add(new HumanBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]), blg));
						}
					
					if (strSpl[0].compareTo("F")==0 ) {
						switch (strSpl[5]) {
						case "Detective": stl=Style.Detective; 
								break;
						case "Novel": stl=Style.Novel; 
								break;
						case "Memoir": stl=Style.Memoir; 
								break;
						default: 		stl=Style.Memoir;
								break;
						}
						homeLibrary.add(new FictionBook(strSpl[1], strSpl[2], Integer.parseInt(strSpl[3]), 
								Integer.parseInt(strSpl[4]), stl));
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
		    
		 for (Books item : homeLibrary.getTbooks()) {
				item.printBook();
			}
	}
}
