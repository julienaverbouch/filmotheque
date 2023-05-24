package fr.eni.movielibrary.bo;

import java.util.List;

public class Participant {
	
	private long id;
	private String lastName;
	private String firstName;
	private List<Movie> director;
	private List<Movie> listActors;
	
	public Participant(long id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	public Participant(long id, String lastName, String firstName, List<Movie> director, List<Movie> listActors) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.director = director;
		this.listActors = listActors;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public List<Movie> getDirector() {
		return director;
	}
	public void setDirector(List<Movie> director) {
		this.director = director;
	}
	public List<Movie> getListActors() {
		return listActors;
	}
	public void setListActors(List<Movie> listActors) {
		this.listActors = listActors;
	}
	@Override
	public String toString() {
		return "Participant [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", director="
				+ director + ", listActors=" + listActors + "]";
	}
	
	
}
