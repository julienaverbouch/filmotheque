package fr.eni.movielibrary;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.ihm.MovieController;

@SpringBootApplication
public class MovieLibraryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MovieLibraryApplication.class, args);
	}

}
