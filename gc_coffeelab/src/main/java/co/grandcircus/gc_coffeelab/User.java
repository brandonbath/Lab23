package co.grandcircus.gc_coffeelab;

import org.springframework.stereotype.Component;

@Component
public class User {

	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	String password;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String email, String phoneNumber, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Hello " + firstName + "! Thank you for registering.\n" + "Email: " + email + ".\n" + "Phone: " + phoneNumber;
	}
	
}
	
	