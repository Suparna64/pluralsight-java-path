package com.jcsanchez.controller;

import com.jcsanchez.model.Activity;
import com.jcsanchez.model.Exercise;
import com.jcsanchez.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by jsssn on 21-May-17.
 */

@Controller
public class MinutesController {

    @Autowired
    private ExerciseService executorService;

    @RequestMapping(value = "/addMinutes")
    public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
        System.out.println("exercise: " + exercise.getMinutes());
        System.out.println("exercise activity: " + exercise.getActivity());

        return "addMinutes";
    }

    @RequestMapping(value = "/activities", method = RequestMethod.GET)
    public @ResponseBody
    List<Activity> findAllActivities() {
        return executorService.findAllActivities();
    }

//    @RequestMapping(value = "/addMoreMinutes")
//    public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//        System.out.println("exercising " + exercise.getMinutes());
//
//        return "addMinutes";
//    }
}
