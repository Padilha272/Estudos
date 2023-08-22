package entities;

import java.util.Objects;

public class User implements Comparable<User>{
	
	private String name;
	private int password;
	
	public User(String name, int password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	

	

	@Override
	public int hashCode() {
		return Objects.hash(name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name) && password == other.password;
	}

	@Override
	public int compareTo(User o) {
		return name.toUpperCase().compareTo(o.getName().toUpperCase());
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	
	
	
	
}
