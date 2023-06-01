package fr.eni.movielibrary.dao;

import java.util.List;

import fr.eni.movielibrary.bo.Movie;

public interface MovieDAO {

	public Movie findById(long id);
	
	public List<Movie> findAll();
	
	public void remove(long id);
	
	public void save(Movie movie);
}
