package com.minsk.timetable.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.xml.bind.ValidationException;

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

    public TimetableService() {
        dao = null;
    }

   /* @Autowired
    public TimetableService(ITimetableDao dao) {
        this.dao = dao;
    }*/

    @Override
    public List<TimeTableRow> findAll() {
        return dao.findAll();
    }

    @Override
    public Optional<TimeTableRow> findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public Long create(TimeTableRow row) throws ValidationException {
        if (null == row.getId()) {
            return dao.save(row).getId();
        } else {
            throw new ValidationException("ID must be null");
        }
    }

    @Override
    public Long update(TimeTableRow row) throws ValidationException {
        if (null != row.getId()) {
            return dao.save(row).getId();
        } else {
            throw new ValidationException("ID must NOT be null");
        }
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }
}
