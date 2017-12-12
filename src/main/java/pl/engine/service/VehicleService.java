package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.engine.entity.Inspection;
import pl.engine.entity.Owner;
import pl.engine.entity.Vehicle;
import pl.engine.entity.VehicleOwner;
import pl.engine.repository.VehicleDao;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    @Transactional
    public void create(Vehicle station) {
        vehicleDao.save(station);
    }

    @Transactional
    public Vehicle update(Long id, Vehicle entity) {
        entity.setId(id);
        return vehicleDao.save(entity);
    }

    public void delete(Long id) {
        if (vehicleDao.exists(id)) vehicleDao.delete(id);
        else System.out.println("there is no vehicle with id=" + id);
    }

    public Vehicle findOne(Long id) {
        return vehicleDao.findOne(id);
    }

    public List<Vehicle> findAll() {
        return vehicleDao.findAll();
    }

    public List<Owner> getOwnersByVehicleId(Long id) {
        return vehicleDao.findOne(id).getOwners().stream().map(VehicleOwner::getOwner).collect(Collectors.toList());
    }

    public List<Inspection> getAllInspectionsByVehicleId(Long id) {
        return vehicleDao.findOne(id).getInspections();
    }

}
