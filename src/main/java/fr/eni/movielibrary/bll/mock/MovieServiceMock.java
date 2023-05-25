package fr.eni.movielibrary.bll.mock;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Genre;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Participant;

@Service
@Profile("dev")
public class MovieServiceMock implements MovieService {
	// Attributs static pour gérer les valeurs à afficher
	private static List<Movie> lstMovies;
	private static List<Genre> lstGenres;
	private static List<Participant> lstParticipants;

	private static final String[] genres = { "Animation", "Science-fiction", "Documentaire", "Action", "Comédie",
			"Drame" };

	public MovieServiceMock() {
		// Création de la liste des genres
		lstGenres = new ArrayList<>();
		for (int index = 0; index < genres.length; index++) {
			lstGenres.add(new Genre(index + 1, genres[index]));
		}

		// Création de la liste des participants
		lstParticipants = new ArrayList<>();
		// 2 réalisateurs dont 1 pour 2 films
		Participant stevenSpielberg = new Participant(1, "Spielberg", "Steven");
		Participant davidCronenberg = new Participant(2, "Cronenberg", "David");
		lstParticipants.add(stevenSpielberg);
		lstParticipants.add(davidCronenberg);

		// 2 acteurs par film et l'un d'eux dans 2 films
		Participant richardAttenborough = new Participant(3, "Attenborough", "Richard");
		Participant jeffGoldblum = new Participant(4, "Goldblum", "Jeff");
		List<Participant> actorsJurassicPark = new ArrayList<>();
		actorsJurassicPark.add(richardAttenborough);
		actorsJurassicPark.add(jeffGoldblum);
		lstParticipants.addAll(actorsJurassicPark);

		Participant geenaDavis = new Participant(5, "Davis", "Geena");
		List<Participant> actorsTheFly = new ArrayList<>();
		actorsTheFly.add(jeffGoldblum);
		actorsTheFly.add(geenaDavis);
		lstParticipants.add(geenaDavis);

		Participant markRylance = new Participant(6, "Rylance", "Mark");
		Participant rubyBarnhill = new Participant(7, "Barnhill", "Ruby");
		List<Participant> actorsTheBFG = new ArrayList<>();
		actorsTheBFG.add(markRylance);
		actorsTheBFG.add(rubyBarnhill);
		lstParticipants.addAll(actorsTheBFG);

		// Création de la liste de films
		// 3 films
		lstMovies = new ArrayList<>();
		Movie jurassicPark = new Movie(1, "Jurassic Park", 1993, 128,
				"Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant à ramener à la vie des dinosaures.","https://upload.wikimedia.org/wikipedia/fr/6/6a/Jurassic_Park_logo.svg");
		jurassicPark.setGenre(lstGenres.get(1));
		jurassicPark.setDirector(stevenSpielberg);
		jurassicPark.setListActors(actorsJurassicPark);
		lstMovies.add(jurassicPark);

		Movie theFly = new Movie(2, "The Fly", 1986, 95,
				"Il s'agit de l'adaptation cinématographique de la nouvelle éponyme de l'auteur George Langelaan.","data:image/jpeg;base64,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");
		theFly.setGenre(lstGenres.get(1));
		theFly.setDirector(davidCronenberg);
		theFly.setListActors(actorsTheFly);
		lstMovies.add(theFly);

		Movie theBFG = new Movie(3, "The BFG", 2016, 117,
				"Le Bon Gros Géant est un géant bien différent des autres habitants du Pays des Géants.","https://m.media-amazon.com/images/I/91blJEoDdcL._AC_SY445_.jpg");
		theBFG.setGenre(lstGenres.get(4));
		theBFG.setDirector(stevenSpielberg);
		theBFG.setListActors(actorsTheBFG);
		lstMovies.add(theBFG);
	}

	@Override
	public List<Movie> getAllMovies() {
		return lstMovies;
	}

	@Override
	public Movie getMovieById(long id) {
		for (Movie movie : lstMovies) {
			if (movie.getId() == id) {
				return movie;
			}
		}
		return null;
	}

	@Override
	public List<Genre> getGenres() {
		return lstGenres;
	}

	@Override
	public List<Participant> getParticipants() {
		return lstParticipants;
	}

	@Override
	public Genre getGenreById(long id) {
		for (Genre genre : lstGenres) {
			if (genre.getId() == id) {
				return genre;
			}
		}
		return null;
	}

	@Override
	public Participant getParticipantById(long id) {
		for (Participant participant : lstParticipants) {
			if (participant.getId() == id) {
				return participant;
			}
		}
		return null;
	}

	@Override
	public void saveMovie(Movie movie) {
		lstMovies.add(movie);
	}
}

