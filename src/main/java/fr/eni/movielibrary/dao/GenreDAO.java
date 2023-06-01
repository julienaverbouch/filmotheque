package fr.eni.movielibrary.dao;

import java.util.List;

import fr.eni.movielibrary.bo.Genre;

public interface GenreDAO {
	
	public List<Genre> findAll();

	public Genre findById(long id);
	
	public void remove(long id);
	
	public void save(Genre genre);
}
