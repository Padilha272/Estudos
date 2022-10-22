package entities;

public class Student {

	public String name;
	public int grade1;
	public int grade2;
	public int grade3;
	
	public Student(String name, int grade1, int grade2, int grade3) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}
	
	
	public void finalGrade(int grade1,int grade2,int grade3) {
		if((grade1+grade2+grade3)<60) {
			System.out.println("FINAL GRADE: "+(grade1+grade2+grade3));
			System.out.println("FAILED");
			System.out.println("MISSING POINTS: "+(60-(grade1+grade2+grade3)));
		}else {
			System.out.println("FINAL GRADE: "+(grade1+grade2+grade3));
			System.out.println("PASS");
		}
		
	}
	
	
	
	
	
	
	
}
