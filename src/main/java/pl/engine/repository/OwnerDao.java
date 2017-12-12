package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.entity.Owner;

@Repository
public interface OwnerDao extends JpaRepository<Owner, Long> {
}
