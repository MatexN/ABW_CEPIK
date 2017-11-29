package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.repository.DiagnosticStationDao;
import pl.engine.model.DiagnosticStation;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class DiagnosticStationService {

    @Autowired
    private DiagnosticStationDao stationDao;

    @Transactional
    public void create(DiagnosticStation station) {
        stationDao.save(station);
    }

    @Transactional
    public DiagnosticStation update(Long id, DiagnosticStation entity) {
        entity.setId(id);
        return stationDao.save(entity);
    }

    public void delete(Long id) {
        if (stationDao.exists(id)) stationDao.delete(id);
        else System.out.println("there is no diagnostic station with id=" + id);
    }

    public DiagnosticStation findOne(Long id) {
        return stationDao.findOne(id);
    }

    public List<DiagnosticStation> findAll() {
        return stationDao.findAll();
    }
}
