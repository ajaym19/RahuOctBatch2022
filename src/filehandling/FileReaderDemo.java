package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/*
	 * Library ABC >> XYZ
	 * Drawbacks:
	 * reading one character at a time
	 * reading data into int
	 * 
	 */

	public static void main(String[] args) throws IOException {
		//writerdemo();
		readerdemo();
	}
	
	public static void readerdemo() throws IOException {
		String filePath = "./src/filehandling/TestFile";
		FileReader reader = new FileReader(filePath);
		//System.out.println((char) (reader.read()));
		
		int value;
		while((value = reader.read()) != -1 ) {
			System.out.print((char)value);
		}
		reader.close();
	}
	
	
	public static void writerdemo() throws IOException {
		String filePath = "./src/filehandling/TestFile";
		FileWriter writer = new FileWriter(filePath);
		writer.write("Hello World");
		writer.close();
	}
	
	
}
