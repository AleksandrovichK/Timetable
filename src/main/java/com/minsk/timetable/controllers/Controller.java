package com.minsk.timetable.controllers;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import com.minsk.timetable.dto.TimeTableRow;
import com.minsk.timetable.service.ITimetableService;

import org.springframework.web.bind.annotation.*;

/**
 * @author AleksandrovichK
 * @author KotsyubaT
 * @author LapoM
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

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rows/", params = {"id"})
    public Optional<TimeTableRow> getRowById(final @RequestParam(name="id", required = false) Long id) {

        return service.findById(id);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rows/", params = {"day"})
    public List<TimeTableRow> getRowByDay(final @RequestParam(name="day", required = false) String day) {

        return service.findByDay(day);
    }

    /*@RequestMapping(method = RequestMethod.GET, value = "/rows/{id}")
    public Optional<TimeTableRow> getRowById(@PathVariable (required = false) Long id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rows/")
    public Optional<TimeTableRow> getRowById(@RequestParam (required = false, name = "id") Long id) {
        return service.findById(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/rows/")
    public List<TimeTableRow> getRowByDay(@RequestParam (required = false, name = "day") String day) {
        return service.findByDay(day);
    }
*/
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rows/", params = {"teacher"})
    public List<TimeTableRow> getRowByTeacher(@RequestParam (required = false, name = "teacher") String teacherName) {
        return service.findByTeacher(teacherName);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rows/", params = {"room"})
    public List<TimeTableRow> getRowByRoom(@RequestParam (required = false, name = "room") String room) {
        return service.findByRoom(room);
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/rows/", params = {"iscancelled"})
    public List<TimeTableRow> getRowByIsCancelled(@RequestParam (required = false, name = "iscancelled")  Boolean isCancelled) {
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

    /*
    *Need to test
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/rows/", params = {"drop"})
    public void deleteAll(@RequestParam (required = false, name = "drop") String drop){
        if (drop.equals("all"))
            service.deleteAllRows();
    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE, value = "/rows/", params = {"id"})
    public void deleteRow(@RequestParam (required = false, name = "id") Long id) {
        service.deleteById(id);
    }
}

