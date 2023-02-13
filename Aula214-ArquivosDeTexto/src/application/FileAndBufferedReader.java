package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAndBufferedReader {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\in.txt";
		
		
		try (BufferedReader br = new BufferedReader (new FileReader(path))){
		
			// br = new BufferedReader(fr = new FileReader(path));
			
			String line = br.readLine();
			
			while(line !=null){
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch(IOException e ) {
			System.out.println("Error: "+e.getMessage());
		}
	
	}
}
