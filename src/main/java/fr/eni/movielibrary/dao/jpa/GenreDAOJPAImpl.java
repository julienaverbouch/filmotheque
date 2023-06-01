package fr.eni.movielibrary.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.dao.GenreDAO;

@Component
@Profile("jpa")
public class GenreDAOJPAImpl implements GenreDAO{

	@Autowired
	private GenreRepository genreRepository;
	
	@Override
	public List<Genre> findAll() {
		return (List<Genre>) genreRepository.findAll();
	}
	
	@Override
	public Genre findById(long id) {
		Optional<Genre> genre = genreRepository.findById(id);
		
		return genre.get();
	}

	@Override
	public void remove(long id) {
		genreRepository.deleteById(id);
	}

	@Override
	public void save(Genre genre) {
		genreRepository.save(genre);
	}

}
