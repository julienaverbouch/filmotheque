package fr.eni.movielibrary.dao;

import java.util.List;

import fr.eni.movielibrary.bo.Opinion;

public interface OpinionDAO {
	
	public List<Opinion> findAll();
	
	public Opinion findById(long id);
	
	public void remove(long id);
	
	public void save(Opinion opinion);

}
