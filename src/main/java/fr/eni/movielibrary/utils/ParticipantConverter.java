package fr.eni.movielibrary.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bll.mock.MovieServiceMock;
import fr.eni.movielibrary.bo.Participant;

@Component
public class ParticipantConverter implements Converter<String, Participant>{
	
	@Autowired
	MovieServiceMock mockServiceMock;

	@Override
	public Participant convert(String id) {
		return mockServiceMock.getParticipantById(Integer.parseInt(id));
	}


}
