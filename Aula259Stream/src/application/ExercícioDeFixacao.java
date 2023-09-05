package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class ExercícioDeFixacao {

	public static void main(String[] args) {

		
		try {
			String path = "c:\\temp\\in6.txt";
			Scanner sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new FileReader(path));
			List<Employee> employees = new ArrayList<>();
			String line = br.readLine();
			while(line != null) {
				line=line.trim();
				if(!line.isEmpty()) {
					String slice[] = line.split(",");
					employees.add(new Employee(
							slice[0],slice[1],Double.parseDouble(slice[2])));
				}
				line=br.readLine();
			}
			//employees.forEach(System.out::println);
			System.out.println("Type a value: ");
			double salary = sc.nextDouble();
			Comparator<String> comp = (s1,s2)->s1.toUpperCase().compareTo(s2.toUpperCase());
			List<String> emails = employees.stream().filter
					(v->v.getSalary()>salary).map(e->e.getEmail()).sorted(comp)
					.collect(Collectors.toList());
			double sum = employees.stream().filter(n->n.getName().startsWith("M"))
			.map(p->p.getSalary()).reduce(0.0,(x,y)->x+y);		
			System.out.println("Sum: "+sum);
			emails.forEach(System.out::println);
			
		} catch (FileNotFoundException e) {			
			System.out.println("Error: "+e.getMessage());
		} catch (IOException e) {
			
			System.out.println("Error: "+e.getMessage());
		}

	}

}
