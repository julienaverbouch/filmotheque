package fr.eni.movielibrary.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "opinions")
public class Opinion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private int note;
	
	@Column(nullable = false)
	private String comment;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "member_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Member member;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "movie_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Movie movie;
	
	public Opinion() {}

	public Opinion(long id, int note, String comment) {
		super();
		this.id = id;
		this.note = note;
		this.comment = comment;
	}

	public Opinion(long id, int note, String comment, Member member, Movie movie) {
		super();
		this.id = id;
		this.note = note;
		this.comment = comment;
		this.member = member;
		this.movie = movie;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Opinion [id=");
		builder.append(id);
		builder.append(", note=");
		builder.append(note);
		builder.append(", comment=");
		builder.append(comment);
		builder.append(", member=");
		builder.append(member);
		builder.append(", movie=");
		builder.append(movie);
		builder.append("]");
		return builder.toString();
	}

}
