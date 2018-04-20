package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * The purpose of this program is to select a given amount of files from two directories.
 */

public class Main {

	public static void main(String[] args) throws IOException {
		File Dir1 = new File("C:\\Users\\colby\\Desktop\\SCHOOL\\AndroidCT\\Cleaned Disassembly\\Malware");
		File Dir2 = new File("C:\\Users\\colby\\Desktop\\SCHOOL\\AndroidCT\\Cleaned Disassembly\\Benign");
		File[] Array1 = Dir1.listFiles();
		File[] Array2 = Dir2.listFiles();
		List<File> Files1 = new ArrayList<File>(Arrays.asList(Array1));
		List<File> Files2 = new ArrayList<File>(Arrays.asList(Array2));
		int numToChoose = 1000; //FROM EACH

		// OUTPUT FILE
		BufferedWriter referList = new BufferedWriter(new FileWriter("C:/Users/colby/Desktop/SCHOOL/AndroidCT/List of Files.txt"));
		referList.write("Malware:");
		referList.newLine();

		//Initialize random generator
		Random randomGenerator = new Random();

		//LOOP THROUGH DIR1
		
		for(int counter = 0; counter < numToChoose; counter++) {
			System.out.println(counter);
			//Get a random file
			int index = randomGenerator.nextInt(Files1.size());
			File f = Files1.get(index);
			Files1.remove(index);

			//Output file name
			referList.write(f.getName());
			System.out.println(f.getName());
			referList.newLine();
		}
		
		referList.newLine();
		referList.write("Benign:");
		referList.newLine();

		//LOOP THROUGH DIR1
		for(int counter = 0; counter < numToChoose; counter++) {
			System.out.println(counter);
			//Get a random file
			int index = randomGenerator.nextInt(Files2.size());
			File f = Files2.get(index);
			Files1.remove(index);

			//Output file name
			referList.write(f.getName());
			System.out.println(f.getName());
			referList.newLine();
		}
		
		referList.close();
	}

}
