package com.codestates.testrepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String testRepository(){
        return "To-do Application !";
    }

}
