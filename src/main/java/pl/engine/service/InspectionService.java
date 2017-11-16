package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.repository.InspectionDao;
import pl.engine.model.Inspection;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class InspectionService {

    @Autowired
    private InspectionDao inspectionDao;

    @Transactional
    public void create(Inspection inspection) {
        inspectionDao.save(inspection);
    }

    @Transactional
    public Inspection update(Long id, Inspection entity) {
        entity.setId(id);
        return inspectionDao.save(entity);
    }

    public void delete(Long id) {
        if (inspectionDao.exists(id)) inspectionDao.delete(id);
        else System.out.println("there is no inspection with id=" + id);
    }

    public Inspection findOne(Long id) {
        return inspectionDao.findOne(id);
    }

    public List<Inspection> findAll() {
        return inspectionDao.findAll();
    }
}
