package org.factoriaf5.libritos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeControllers {



@GetMapping("/")

public String home(){
    return "home";
}


}