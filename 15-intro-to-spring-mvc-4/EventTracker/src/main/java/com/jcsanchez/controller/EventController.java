package com.jcsanchez.controller;

import com.jcsanchez.model.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jsssn on 21-May-17.
 */

@Controller
public class EventController {

    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public String displayEventPage(Model model) {
        Event event = new Event();
        event.setName("Java User Group");
        model.addAttribute("event", event);

        return "event";
    }
}
