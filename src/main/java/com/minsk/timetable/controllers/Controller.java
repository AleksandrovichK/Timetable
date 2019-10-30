package com.minsk.timetable.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import com.minsk.timetable.dto.TimeTableRow;
import com.minsk.timetable.service.ITimetableService;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/rows/byDay/")
    @ResponseBody
    public List<TimeTableRow> getRowByDay(@RequestParam String day) {
        return service.findByDay(day);
    }

    @GetMapping("/rows/byTeacherName/")
    @ResponseBody
    public List<TimeTableRow> getRowByTeacher(@RequestParam String teacherName) {
        return service.findByTeacher(teacherName);
    }

    @GetMapping("/rows/byRoom/")
    @ResponseBody
    public List<TimeTableRow> getRowByRoom(@RequestParam String room) {
        return service.findByRoom(room);
    }
    @GetMapping("/rows/byIsCancelled/")
    @ResponseBody
    public List<TimeTableRow> getRowByIsCancelled(@RequestParam Boolean isCancelled) {
        return service.findByIsCancelled(isCancelled);
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

