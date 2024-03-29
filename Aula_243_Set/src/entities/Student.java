package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
	
	
	private int code;
	
	
	
	public Student(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return code == other.code;
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
}
