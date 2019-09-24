package com.minsk.timetable.controllers;

import java.util.List;

import com.minsk.timetable.dto.TimeTableRow;
import com.minsk.timetable.service.ITimetableService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AleksandrovichK
 * @author KotsyubaT
 */
@RestController
public class Controller {
    private final ITimetableService service;

    public Controller(ITimetableService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rows")
    public List<TimeTableRow> getAllRows() {
        return service.findAll();
    }

    /*@RequestMapping(method = RequestMethod.POST, value = "/post-request")
    public String  greetingsPOST(@RequestBody String obj) {
        return "";
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
    }*/
}

