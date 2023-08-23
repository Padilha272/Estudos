package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher {

	private String name;
	Set<Course> subject = new HashSet<>();
	Set<Student> students =new HashSet<>();
	
	public Teacher(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(name, other.name);
	}
	
	public int CountStudents(Set<Set<Student>> sets) {
	    Set<Student> differentStudents = new HashSet<>();
	    
	    for (Set<Student> set : sets) {
	        differentStudents.addAll(set); 
	    }
	    
	    return differentStudents.size(); 
	}

	
	
	
	
}
