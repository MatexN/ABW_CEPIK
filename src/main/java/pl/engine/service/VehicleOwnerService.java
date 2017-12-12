package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.entity.VehicleOwner;
import pl.engine.repository.VehicleOwnerDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VehicleOwnerService {

    @Autowired
    private VehicleOwnerDao vehicleOwnerDao;

    @Transactional
    public VehicleOwner create(VehicleOwner entity) {
        return vehicleOwnerDao.save(entity);
    }

    @Transactional
    public VehicleOwner update(Long id, VehicleOwner entity) {
        entity.setId(id);
        return vehicleOwnerDao.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        if (vehicleOwnerDao.exists(id)) vehicleOwnerDao.delete(id);
        else System.out.println("there is no osoba with id=" + id);
    }

    public VehicleOwner findOne(Long id) {
        return vehicleOwnerDao.findOne(id);
    }

    public List<VehicleOwner> findAll() {
        return vehicleOwnerDao.findAll();
    }
}
