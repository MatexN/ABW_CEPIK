package pl.engine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.engine.entity.Osoba;
import pl.engine.repository.OsobaDao;
import pl.engine.service.base.BaseService;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class OsobaService extends BaseService {

    @Autowired
    OsobaDao repo;

    @Transactional
    public Osoba create(Osoba entity) {
        return repo.save(entity);
    }

    @Transactional
    public Osoba update(Long id, Osoba entity) {
        entity.setId(id);
        return repo.save(entity);
    }

    @Transactional
    public void delete(Long id) {
        if (repo.exists(id)) repo.delete(id);
        else System.out.println("there is no osoba with id=" + id);
    }

    public Osoba findOne(Long id) {
        return repo.findOne(id);
    }

    public List<Osoba> findAll() {
        return repo.findAll();
    }
}
