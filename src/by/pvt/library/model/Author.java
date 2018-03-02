package by.pvt.library.model;

public class Author {
	private int id;
	private String name;
	private String lastName;

	public Author() {
	}

	public Author(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return String.format("Author id = %s, FirstName = %s, LastName = %s",
				getId(), getName(), getLastName());
	}

}
