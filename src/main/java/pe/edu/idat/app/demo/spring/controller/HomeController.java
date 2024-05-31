package pe.edu.idat.app.demo.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {

    @GetMapping("/inicio")
    public String home(){
        return "home";
    }

}
