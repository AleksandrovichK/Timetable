package com.minsk.timetable.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AleksandrovichK
 */
@RestController
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET, value = "/start")
    public String greetings() {
        return "Hello!\nAll the services are working now!";
    }


    @RequestMapping(method = RequestMethod.GET, value = "/error")
    public String error() {
        return "Something went wrong";
    }
}

