package br.edu.infnet.appLogin.controller;

import br.edu.infnet.appLogin.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@RestController
public class HomeController {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @GetMapping("/home")
    public ModelAndView home(Model model) {


        Query query = (Query) entityManager.createQuery("select u from User u", User.class);
        List<User> users = ((TypedQuery<User>) query).getResultList();

        model.addAttribute("users", users);

        return new ModelAndView("home");
    }
}