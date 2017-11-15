package pl.wat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wat.model.Owner;
import pl.wat.repository.OwnerDao;

@Service
public class OwnerService {

    @Autowired
    private OwnerDao ownerDao;

    public void add(Owner owner) {
        ownerDao.save(owner);
    }

    public void delete(Long id) {
        if (ownerDao.exists(id)) ownerDao.delete(id);
        else System.out.println("there is no owner with id=" + id);
    }

    public Owner get(Long id) {
        return ownerDao.exists(id) ? ownerDao.findOne(id) : null;
    }
}
