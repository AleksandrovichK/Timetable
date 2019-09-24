package com.minsk.timetable.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.minsk.timetable.dto.TimeTableRow;
import com.minsk.timetable.repository.ITimetableDao;
import com.minsk.timetable.service.ITimetableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author AleksandrovichK
 */
@Service
@Transactional
public class TimetableService implements ITimetableService {
    private final ITimetableDao dao;

    @Autowired
    public TimetableService(ITimetableDao dao) {
        this.dao = dao;
    }

    @Override
    public Optional<TimeTableRow> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Long save(TimeTableRow row) {
        return dao.save(row).getId();
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public List<TimeTableRow> findAll() {
        return dao.findAll();
    }
}
