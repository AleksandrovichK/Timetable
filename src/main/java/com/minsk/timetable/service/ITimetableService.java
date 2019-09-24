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

    List<TimeTableRow> findAll();

    Long create(TimeTableRow row) throws ValidationException;

    Long update(TimeTableRow row) throws ValidationException;
}
