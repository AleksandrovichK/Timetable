package com.minsk.timetable.controllers;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import com.minsk.timetable.dto.TimeTableRow;
import com.minsk.timetable.service.ITimetableService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping(method = RequestMethod.GET, value = "/rows/{id}")
    public Optional<TimeTableRow> getRowById(@PathVariable Long id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/rows")
    public Long createRow(@RequestBody TimeTableRow row) throws ValidationException {
        return service.create(row);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/rows")
    public Long updateRow(@RequestBody TimeTableRow row) throws ValidationException {
        return service.update(row);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/rows/{id}")
    public void deleteRow(@PathVariable Long id) {
        service.deleteById(id);
    }
}

