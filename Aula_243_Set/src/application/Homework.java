package application;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.Student;
import entities.Teacher;

public class Homework {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher("Jones");
		Set<Student> listA = new HashSet<>();
		Set<Student> listB = new HashSet<>();
		Set<Student> listC = new HashSet<>();
		Set<Set<Student>> allClasses = new HashSet<>();
		
		
		System.out.print("How many students for course A ?");
		int courseA = sc.nextInt();
		for(int i = 0;i <courseA;i++) {
			int code=sc.nextInt();
			Student student = new Student(code);
			listA.add(student);						
		}
		System.out.println(listA.size());
		
		
		
		System.out.print("How many students for course B ?");
		int courseB = sc.nextInt();
		for(int i = 0;i <courseB;i++) {
			int code=sc.nextInt();
			Student student = new Student(code);
			listB.add(student);						
		}
		
		System.out.print("How many students for course C ?");
		int courseC = sc.nextInt();
		for(int i = 0;i <courseC;i++) {
			int code=sc.nextInt();
			Student student = new Student(code);
			listC.add(student);						
		}
		
		allClasses.add(listA);
		allClasses.add(listB);
		allClasses.add(listC);
		System.out.println(teacher.CountStudents(allClasses));
		
		
		
		
		
		

	}

}
