package com.minsk.timetable.service;

import java.util.List;
import java.util.Optional;

import javax.xml.bind.ValidationException;

import com.minsk.timetable.dto.TimeTableRow;

/**
 * @author AleksandrovichK
 */
public interface ITimetableService {
    Optional<TimeTableRow> findById(Long id);

    void deleteById(Long id);

    void deleteAllRows();

    List<TimeTableRow> findAll();

    List<TimeTableRow> findByDay(String day);

    List<TimeTableRow> findByTeacher(String teacherName);

    List<TimeTableRow> findByRoom(String room);

    List<TimeTableRow> findByIsCancelled(Boolean isCancelled);

    Long create(TimeTableRow row) throws ValidationException;

    Long update(TimeTableRow row) throws ValidationException;

}
