package com.prog.controller;

import com.prog.entity.UserDtls;
import com.prog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserRepository repo;
    @GetMapping("/")
    public String home(){
        return "finalsignup";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDtls u){
        System.out.println(u);
        repo.save(u);
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String welcomePage() {
        return "login"; // returns welcome.html
    }

    @GetMapping("/dashboard")
    public String DashboardPage() {
        return "dashboardfinal"; // returns welcome.html
    }

}
