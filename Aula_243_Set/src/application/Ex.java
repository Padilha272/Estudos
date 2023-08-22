package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import entities.User;

public class Ex {

	public static void main(String[] args) throws IOException  {
		
		Set<User> list = new HashSet<>();
		
		String path = "c:\\temp\\in3.txt";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));	
			String line = br.readLine();
			while(line !=null) {
				line = line.trim();
				if(!line.isEmpty()) {
					String[] fields = line.split(",");
					list.add(new User(fields[0],Integer.parseInt(fields[1])));
					System.out.println(line);
				}
				line = br.readLine();
			}
			
			for(User item : list) {
				System.out.println(item);
			}
			int different = list.size();
			System.out.println(different);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		/*
		list.add(new User("Maria",12));
		list.add(new User("Bob",3424));
		list.add(new User("Alex",5466));
		list.add(new User("Donald",7897));
		
		
		
		//Set<User> copiedList = new TreeSet<>(list);
		//int equal=0;
		int different = list.size();
		for(User user: list) {
			System.out.println(user);
		}
		System.out.println(different);
		/*
		for(User user: list) {
			for (User copy: copiedList) {
				if(copy.equals(user)) {
					equal+=1;
				}
			}
		}
		System.out.println("Different: "+equal);*/
		
	}

}
