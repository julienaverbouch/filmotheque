package fr.eni.movielibrary.ihm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.movielibrary.bll.mock.MovieServiceMock;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Person;

@Controller
public class MovieController {

	@Autowired
	private MovieServiceMock movieServiceMock;
	
	@GetMapping("/movies")
	public String moviesPage(Model model) {
		model.addAttribute("movies", movieServiceMock.getAllMovies());
		return "movie/movies";
	}
	
	@GetMapping("/movies/detail/{id}")
	public String detailMoviePage(@PathVariable("id") int id, Model model) {
		model.addAttribute("movie", movieServiceMock.getMovieById(id));
		return "movie/detailMovie";
	}
	@GetMapping("/movies/edit/{id}")
	public String editMoviePage(@PathVariable("id") int id, Model model) {
		model.addAttribute("movie", movieServiceMock.getMovieById(id));
		return "movie/editMovie";
	}
	@PostMapping("movie")
	public String personSubmit(@ModelAttribute("formMovie") Movie movie) {
		return "redirect:/movies";
	}
}
