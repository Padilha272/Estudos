package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class ExSolution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "c:\\temp\\in4.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			while(line !=null){
				line = line.trim();
				String[] slice = line.split(" ");
				String username = slice[0];
				Date moment = Date.from(Instant.parse(slice[1]));
				set.add(new LogEntry(username,moment));
				line=br.readLine();
			}
			for(LogEntry item : set) {
				System.out.println(item);
			}
			System.out.println("Total Users: "+set.size());
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: "+e.getMessage());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		sc.close();
	}

}
