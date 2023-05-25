package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {

	private long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;
	private String image;
	private Participant director;
	private List<Participant> listActors;
	private List<Opinion> listOpinions;
	private Genre genre;
	
	public Movie(long id, String title, int year, int duration, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
	}
	public Movie(long id, String title, int year, int duration, String synopsis, String image) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.image = image;
	}
	public Movie(long id, String title, int year, int duration, String synopsis, Participant director,
			List<Participant> listActors, List<Opinion> listOpinions, Genre genre) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
		this.director = director;
		this.listActors = listActors;
		this.listOpinions = listOpinions;
		this.genre = genre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public Participant getDirector() {
		return director;
	}
	public void setDirector(Participant director) {
		this.director = director;
	}
	public List<Participant> getListActors() {
		return listActors;
	}
	public void setListActors(List<Participant> listActors) {
		this.listActors = listActors;
	}
	public List<Opinion> getListOpinions() {
		return listOpinions;
	}
	public void setListOpinions(List<Opinion> listOpinions) {
		this.listOpinions = listOpinions;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [id=");
		builder.append(id);
		builder.append("]");
		builder.append("\n");
		builder.append("title : ");
		builder.append(title);
		builder.append("[");
		builder.append("year : ");
		builder.append(year);
		builder.append(", ");
		builder.append("duration : ");
		builder.append(duration);
		builder.append(" ]");
		builder.append("\n");
		builder.append("synopsis : ");
		builder.append(synopsis);
		builder.append("\n");
		builder.append("director :");
		builder.append(director);
		builder.append("\n");
		builder.append("listActors :");
		builder.append(listActors);
		builder.append("\n");
		builder.append("listOpinions :");
		builder.append(listOpinions);
		builder.append("\n");
		builder.append("genre :");
		builder.append(genre);
		builder.append("\n");
		builder.append("]");
		return builder.toString();
	}

}
