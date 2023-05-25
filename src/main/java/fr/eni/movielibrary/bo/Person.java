package fr.eni.movielibrary.bo;

public class Person {

	private String slug;
	private String firstname;
	private String lastname;
	public Person(String slug, String firstname, String lastname) {
		super();
		this.slug = slug;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [slug=");
		builder.append(slug);
		builder.append(", firstname=");
		builder.append(firstname);
		builder.append(", lastname=");
		builder.append(lastname);
		builder.append("]");
		return builder.toString();
	}
	
	
}
