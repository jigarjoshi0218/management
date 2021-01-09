package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("mainController")
public class mainController {

    @GetMapping("/")
    public String getString() {
        System.out.println("mainController");
        return "mainController";
    }

}
