package app;

import java.util.Scanner;

import entities.Student;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student(null, 0, 0, 0);
		System.out.println("Name");
		student.setName(sc.nextLine());
		System.out.println("Grade1:");
        student.setGrade1(sc.nextInt());
        System.out.println("Grade2:");
        student.setGrade2(sc.nextInt());
        System.out.println("Grade3:");
        student.setGrade3(sc.nextInt());
        student.finalGrade(student.getGrade1(), student.getGrade2(), student.getGrade3());
        
        
        
        
        
        
        
	}

}
