package fr.eni.movielibrary.ihm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import fr.eni.movielibrary.bo.Member;

@Controller
@SessionAttributes({"loggedUser"})
public class UserController {

	@GetMapping("/login")
	public String login(Model model) {
		
		model.addAttribute("user", new Member());
		return "user/login";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute("formUser") Member member, Model model) {
		
		model.addAttribute("loggedUser", member);
		
		return "redirect:/movies";
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus sessionStatus) {
		
		sessionStatus.setComplete();
		
		return "redirect:/movies";
	}
}