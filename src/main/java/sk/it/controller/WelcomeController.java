package sk.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class WelcomeController {

    @RequestMapping
    public String printDefault(Model model) {
        model.addAttribute("message", "Welcome message from WelcomCOntroller.jav ");
        return "default";
    }
}
