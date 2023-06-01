package fr.eni.movielibrary.dao.jpa;

import org.springframework.data.repository.CrudRepository;

import fr.eni.movielibrary.bo.Opinion;

public interface OpinionRepository extends CrudRepository<Opinion, Long>{

}
