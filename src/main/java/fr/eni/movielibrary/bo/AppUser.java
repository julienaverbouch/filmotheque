package fr.eni.movielibrary.bo;

public class AppUser {

	private String email;
	private String password;
	private String pseudo;
	
	
	public AppUser(String email, String password, String pseudo) {
		super();
		this.email = email;
		this.password = password;
		this.pseudo = pseudo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	
}
