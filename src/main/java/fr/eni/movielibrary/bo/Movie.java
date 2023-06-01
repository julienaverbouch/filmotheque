package fr.eni.movielibrary.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private int year;
	
	@Column(nullable = false)
	private int duration;
	
	@Column(nullable = false)
	private String synopsis;
	
	@Column(nullable = true)
	private String image;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "director_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Participant director;
	
	@ManyToMany
	@JoinTable(
	name = "actors", 
	joinColumns = @JoinColumn(name = "participant_id"),
	inverseJoinColumns = @JoinColumn(name = "list_actor_id")
	) 
	private List<Participant> listActors;
	
	@OneToMany(mappedBy = "movie")
	private List<Opinion> listOpinions;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "genre_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Genre genre;
	
	
	
	public Movie() {
		super();
	}
	
	public Movie(long id, String title, int year, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.duration = duration;
	}
	
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


}
