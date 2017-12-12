package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.engine.entity.Osoba;

public interface OsobaDao extends JpaRepository<Osoba, Long> {
}
