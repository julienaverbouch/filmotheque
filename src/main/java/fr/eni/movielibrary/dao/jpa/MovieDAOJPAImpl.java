package fr.eni.movielibrary.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.dao.MovieDAO;

@Component
@Profile("jpa")
public class MovieDAOJPAImpl implements MovieDAO{
	
	@Autowired
	private MovieRepository movieRepository;

	
	@Override
	public List<Movie> findAll() {
		return (List<Movie>) movieRepository.findAll();
	}
	
	@Override
	public Movie findById(long id) {
		Optional<Movie> movie = movieRepository.findById(id);
		
		return movie.get();
	}

	@Override
	public void remove(long id) {
		movieRepository.deleteById(id);
	}

	@Override
	public void save(Movie movie) {
		movieRepository.save(movie);
		
	}


}
