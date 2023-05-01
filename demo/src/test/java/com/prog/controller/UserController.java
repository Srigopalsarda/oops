package com.prog.controller;
import com.prog.entity.UserDtls;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {

    @GetMapping("/")
    public String home()
    {
        return "index2";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute UserDtls u){

        System.out.println(u);
        return "redirect:/";

    }
}
