package pl.wat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.model.Inspection;
import pl.wat.repository.InspectionDao;

@Service
public class InspectionService {

    @Autowired
    private InspectionDao inspectionDao;

    public void add(Inspection inspection) {
        inspectionDao.save(inspection);
    }

    public void delete(Long id) {
        if (inspectionDao.exists(id)) inspectionDao.delete(id);
        else System.out.println("there is no inspection with id=" + id);
    }

    public Inspection get(Long id) {
        return inspectionDao.exists(id) ? inspectionDao.findOne(id) : null;
    }
}
