package fr.eni.movielibrary.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import fr.eni.movielibrary.bo.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long>{

}
