package br.com.infnet.mvc.appCadastro_TP3.controller;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.mvc.appCadastro_TP3.model.User;

@RestController
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = (Query) entityManager.createQuery("select u from User u", User.class);
		List<User> users = ((TypedQuery<User>) query).getResultList();
		
		model.addAttribute("users", users);
		
		
		return "home";
	}
}
