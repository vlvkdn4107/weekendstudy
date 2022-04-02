package ch02.Userdata;

import java.util.Objects;

public class User {

	String name;
	int number;
	
	public User(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if ( getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", number=" + number + "]";
	}
	
	
	
	
}
