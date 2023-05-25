package fr.eni.movielibrary.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.movielibrary.bo.Person;

@Controller
public class personController {

	@GetMapping("person/{slug}")
	public String person(@PathVariable("id") String slug, Model model) {
		
		Person person = new Person(slug,"Jacques", "Chirac");
		model.addAttribute(person);
		return "person/person";
	}
	
	@PostMapping("person")
	public String personSubmit(@ModelAttribute("formPerson") Person person) {
		return "redirect:/movies";
	}
}
