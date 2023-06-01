package fr.eni.movielibrary.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bo.Participant;
import fr.eni.movielibrary.dao.ParticipantDAO;

@Component
@Profile("jpa")
public class ParticipantDAOJPAImpl implements ParticipantDAO{
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Override
	public List<Participant> findAll() {
		return (List<Participant>) participantRepository.findAll();
	}

	@Override
	public Participant findById(long id) {
		Optional<Participant> participant = participantRepository.findById(id);
		return participant.get();
	}

	@Override
	public void remove(long id) {
		participantRepository.deleteById(id);
	}

	@Override
	public void save(Participant participant) {
		participantRepository.save(participant);
	}

}
