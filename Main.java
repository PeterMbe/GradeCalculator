package grade;

import util.InputReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		//The CSV file should already form part of the project
		Scanner scanner = InputReader.getScanner("StudentData.csv");
		
		
		//These two lines would need to be in a loop, otherwise we're only reading one line of the CSV
		String row = scanner.nextLine();
		String[] data = row.split(",");

				
		/*
		 * At this point, 'data' contains nine elements 
		 * Elements 1-3: Student number,first name, surname 
		 * Elements 4-9: Module results, ordered, for CS1OOP, CS1MCP, CS1BAS, CS1CS, CS1PSA, CS1IAD
		 */	
		
	}

}
