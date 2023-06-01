package fr.eni.movielibrary.dao.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.dao.OpinionDAO;

@Component
@Profile("jpa")
public class OpinionDAOJPAImpl implements OpinionDAO{
	
	@Autowired
	private OpinionRepository opinionRepository;
	
	@Override
	public List<Opinion> findAll() {
		return (List<Opinion>) opinionRepository.findAll();
	}

	@Override
	public Opinion findById(long id) {
		Optional<Opinion> opinion = opinionRepository.findById(id);
		return opinion.get();
	}

	@Override
	public void remove(long id) {
		opinionRepository.deleteById(id);
	}

	@Override
	public void save(Opinion opinion) {
		opinionRepository.save(opinion);
	}

}
