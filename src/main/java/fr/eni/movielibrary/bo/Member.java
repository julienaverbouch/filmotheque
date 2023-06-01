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
@Table(name = "members")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String login;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = true)
	private boolean isAdmin;
	
	@OneToMany(mappedBy = "member")
	private List<Opinion> listOpinions;
	
	public Member() {
		login = "";
		password = "";
	}
	
	public Member(String lastName, String firstName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public Member(long id, String lastName, String firstName, String login, String password, boolean isAdmin, List<Opinion> listOpinions ) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.login = login;
		this.password = password;
		this.isAdmin = isAdmin;
		this.listOpinions = listOpinions;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public List<Opinion> getListOpinions() {
		return listOpinions;
	}
	public void setListOpinions(List<Opinion> listOpinions) {
		this.listOpinions = listOpinions;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [id=");
		builder.append(id);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", isAdmin=");
		builder.append(isAdmin);
		builder.append(", listOpinions=");
		builder.append(listOpinions);
		builder.append("]");
		return builder.toString();
	}

}
