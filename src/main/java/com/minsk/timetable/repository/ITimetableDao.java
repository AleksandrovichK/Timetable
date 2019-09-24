package com.minsk.timetable.repository;

import com.minsk.timetable.dto.TimeTableRow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author AleksandrovichK
 */
@Repository
public interface ITimetableDao extends JpaRepository<TimeTableRow, Long> {
}
