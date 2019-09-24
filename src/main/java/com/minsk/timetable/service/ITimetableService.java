package com.minsk.timetable.service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

import com.minsk.timetable.dto.TimeTableRow;

/**
 * @author AleksandrovichK
 */
public interface ITimetableService {
    Long save(TimeTableRow row);

    Optional<TimeTableRow> findById(Long id);

    void deleteById(Long id);

    List<TimeTableRow> findAll();
}
