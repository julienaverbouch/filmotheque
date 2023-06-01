package fr.eni.movielibrary.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import fr.eni.movielibrary.bll.mock.MovieServiceMock;
import fr.eni.movielibrary.bo.Genre;

@Component
public class GenreConverter implements Converter<String, Genre>{

	@Autowired
	MovieServiceMock mockServiceMock;
	
	@Override
	public Genre convert(String id) {
		return mockServiceMock.getGenreById(Integer.parseInt(id));
	}

}
