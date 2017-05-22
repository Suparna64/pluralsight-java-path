package com.jcsanchez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jsssn on 21-May-17.
 */

@Controller
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String sayHello(Model model) {
        model.addAttribute("greeting", "Hello World");

        return "hello";
    }
}
