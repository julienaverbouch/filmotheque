package fr.eni.movielibrary.bll;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.movielibrary.bo.Person;

@Service
public class PersonService {

	List<Person> persons;
	PersonService() {
		persons = Arrays.asList(new Person[] {
				new Person("Isaac","Isaac", "Newton"),
				new Person("Isaac","Isaac", "Newton"),
				new Person("Isaac","Isaac", "Newton"),
		});
	}
	
}
