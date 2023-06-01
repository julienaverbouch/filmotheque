package fr.eni.movielibrary.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "participants")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String firstName;
	
	@OneToMany(mappedBy = "director")
	private List<Movie> director;
	
	@ManyToMany(mappedBy = "listActors")
	private List<Movie> listActors;
	
	public Participant() {}
	
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
		StringBuilder builder = new StringBuilder();
		builder.append("Participant [id=");
		builder.append(id);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", director=");
		builder.append(director);
		builder.append(", listActors=");
		builder.append(listActors);
		builder.append("]");
		return builder.toString();
	}
	
	
}
