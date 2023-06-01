package fr.eni.movielibrary.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.movielibrary.bll.mock.MovieServiceMock;
import fr.eni.movielibrary.bo.Member;
import fr.eni.movielibrary.bo.Movie;
import fr.eni.movielibrary.bo.Opinion;
import fr.eni.movielibrary.dao.jpa.GenreRepository;
import fr.eni.movielibrary.dao.jpa.MemberRepository;
import fr.eni.movielibrary.dao.jpa.MovieRepository;
import fr.eni.movielibrary.dao.jpa.OpinionRepository;
import fr.eni.movielibrary.dao.jpa.ParticipantRepository;

@Controller
@SessionAttributes("loggedUser")
public class MovieController {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private OpinionRepository opinionRepository;
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/movies")
	public String moviesPage(Model model) {
		model.addAttribute("movies", movieRepository.findAll());

		return "movie/movies";
	}
	
	@GetMapping("/movies/detail/{id}")
	public String detailMoviePage(@PathVariable("id") long id, Model model) {
		model.addAttribute("movie", movieRepository.findById(id).get());
		return "movie/detailMovie";
	}
	@GetMapping("/movies/edit/{id}")
	public String editMoviePage(@PathVariable("id") long id, Model model) {
		if(model.getAttribute("loggedUser") != null) {
			model.addAttribute("movie", movieRepository.findById(id));	
			model.addAttribute("participantOptions", participantRepository.findAll());
			model.addAttribute("genreOptions", genreRepository.findAll());
			return "movie/editMovie";
		}else {
			return "redirect:/user/login";
		}
	}
	
	@GetMapping("/movies/add-movie") 
	public String addMoviePage(Model model) {
		model.addAttribute("movie", new Movie());
		model.addAttribute("participantOptions", participantRepository.findAll());
		model.addAttribute("genreOptions", genreRepository.findAll());
		return "movie/addMovie";
	}

	@PostMapping("/movie")
	public String movieSubmit(@ModelAttribute("addFormMovie") Movie movie) {
		movieRepository.save(movie);

		return "redirect:/movies";
	}
	@PostMapping("/movie/addComment")
	public String addCommentPage(@ModelAttribute("addFormOpinion") Opinion opinion) {
		
		return "redirect:/movies";
	}
}
