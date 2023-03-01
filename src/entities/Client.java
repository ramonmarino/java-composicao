package entities;

import java.time.LocalDate;


public class Client {

	private String name;
	private String email;
	private LocalDate bithdate;

	public Client(String name, String email, LocalDate bithdate) {
		this.name = name;
		this.email = email;
		this.bithdate = bithdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBithdate() {
		return bithdate;
	}

	public void setBithdate(LocalDate bithdate) {
		this.bithdate = bithdate;
	}

}
