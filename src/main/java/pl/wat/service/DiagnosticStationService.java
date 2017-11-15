package pl.wat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.model.DiagnosticStation;
import pl.wat.repository.DiagnosticStationDao;


@Service
public class DiagnosticStationService {

    @Autowired
    private DiagnosticStationDao stationDao;

    public void add(DiagnosticStation station) {
        stationDao.save(station);
    }

    public void delete(Long id) {
        if (stationDao.exists(id)) stationDao.delete(id);
        else System.out.println("there is no diagnostic station with id=" + id);
    }

    public DiagnosticStation get(Long id) {
        return stationDao.exists(id) ? stationDao.findOne(id) : null;
    }
}
