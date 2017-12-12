package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.entity.Owner;
import pl.engine.repository.OwnerDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerDao ownerDao;

    @Transactional
    public void create(Owner station) {
        ownerDao.save(station);
    }

    @Transactional
    public Owner update(Long id, Owner entity) {
        entity.setId(id);
        return ownerDao.save(entity);
    }

    public void delete(Long id) {
        if (ownerDao.exists(id)) ownerDao.delete(id);
        else System.out.println("there is no owner with id=" + id);
    }

    public Owner findOne(Long id) {
        return ownerDao.findOne(id);
    }

    public List<Owner> findAll() {
        return ownerDao.findAll();
    }

}
