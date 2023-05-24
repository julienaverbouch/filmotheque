package fr.eni.movielibrary.bo;

import java.util.List;

public class Genre {

	private long id;
	private String label;
	private List<Movie> listGenre;
	
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
