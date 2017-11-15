package pl.wat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.model.VehicleOwner;
import pl.wat.repository.VehicleOwnerDao;

@Service
public class VehicleOwnerService {

    @Autowired
    private VehicleOwnerDao vehicleOwnerDao;

    public void add(VehicleOwner vehicleOwner) {
        vehicleOwnerDao.save(vehicleOwner);
    }

    public void delete(Long id) {
        if (vehicleOwnerDao.exists(id)) vehicleOwnerDao.delete(id);
        else System.out.println("there is no vehicle-owner with id=" + id);
    }

    public VehicleOwner get(Long id) {
        return vehicleOwnerDao.exists(id) ? vehicleOwnerDao.findOne(id) : null;
    }
}
