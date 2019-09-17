package com.minsk.timetable.controllers;

import com.minsk.timetable.dto.CustomObject;

import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(method = RequestMethod.POST, value = "/post-request")
    public CustomObject greetingsPOST(@RequestBody CustomObject obj) {
        return new CustomObject("Taras", 34);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/put-request")
    public String greetingsPUT() {
        return "Here comes PUT";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/del-request")
    public String greetingsDELETE() {
        return "Here comes DELETE";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/error")
    public String error() {
        return "Something went wrong";
    }
}

