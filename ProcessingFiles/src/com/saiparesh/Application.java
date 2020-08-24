package com.saiparesh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args)  {
//		System.out.println("Enter some data");
//		Scanner input = new Scanner(System.in);
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
		
		File file = new File("myFile.txt");
		Scanner input;
		
		try {
			input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		try {
			System.out.println(MyFileUtils.subtract10FromLargerNumber(14));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
