package fr.eni.movielibrary.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genres")
public class Genre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String label;
	
	@OneToMany(mappedBy = "genre")
	private List<Movie> listGenre;
	
	public Genre() {}
	
	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	public Genre(long id, String label, List<Movie> listGenre) {
		super();
		this.id = id;
		this.label = label;
		this.listGenre = listGenre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public List<Movie> getListGenre() {
		return listGenre;
	}
	public void setListGenre(List<Movie> listGenre) {
		this.listGenre = listGenre;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Genre [id=");
		builder.append(id);
		builder.append(", label=");
		builder.append(label);
		builder.append(", listGenre=");
		builder.append(listGenre);
		builder.append("]");
		return builder.toString();
	}

	

}
