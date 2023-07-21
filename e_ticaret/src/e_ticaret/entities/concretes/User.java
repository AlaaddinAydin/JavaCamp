package e_ticaret.entities.concretes;

import e_ticaret.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id ;
	private String firstName;
	private String lastName;
	private String email;
	private String pass;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String firstName, String lastName, String email, String pass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
