package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.model.Owner;
import pl.engine.model.VehicleOwner;
import pl.engine.repository.VehicleOwnerDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VehicleOwnerService {

    @Autowired
    private VehicleOwnerDao vehicleOwnerDao;

    @Transactional
    public void create(VehicleOwner station) {
        vehicleOwnerDao.save(station);
    }

//    @Transactional
//    public VehicleOwner update(Long id, VehicleOwner entity) {
//        entity.setId(id);
//        return vehicleOwnerDao.save(entity);
//    }

    public void delete(Long id) {
        if (vehicleOwnerDao.exists(id)) vehicleOwnerDao.delete(id);
        else System.out.println("there is no vehicle-owner with id=" + id);
    }

    public VehicleOwner findOne(Long id) {
        return vehicleOwnerDao.findOne(id);
    }

    public List<VehicleOwner> findAll() {
        return vehicleOwnerDao.findAll();
    }
//    public List<Owner> getVehicleOwnersById(Long vehicleId) {
//        return vehicleOwnerDao.getVehicleOwnersById(vehicleId);
//    }
    public void test() {

    }
}
