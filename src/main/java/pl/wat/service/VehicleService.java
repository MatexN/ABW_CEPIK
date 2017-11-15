package pl.wat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.model.Vehicle;
import pl.wat.repository.VehicleDao;

@Service
public class VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    public void add(Vehicle vehicle) {
        vehicleDao.save(vehicle);
    }

    public void delete(Long id) {
        if (vehicleDao.exists(id)) vehicleDao.delete(id);
        else System.out.println("there is no vehicle with id=" + id);
    }

    public Vehicle get(Long id) {
        return vehicleDao.exists(id) ? vehicleDao.findOne(id) : null;
    }
}
