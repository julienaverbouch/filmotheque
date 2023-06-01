package fr.eni.movielibrary.dao;

import java.util.List;

import fr.eni.movielibrary.bo.Participant;

public interface ParticipantDAO {
	
	public List<Participant> findAll();

	public Participant findById(long id);
	
	public void remove(long id);
	
	public void save(Participant participant);
}
