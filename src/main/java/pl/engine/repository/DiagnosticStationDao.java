package pl.engine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.engine.entity.DiagnosticStation;
import pl.engine.entity.QDiagnosticStation;
import pl.engine.repository.base.BaseDao;

import java.util.List;

@Repository
public interface DiagnosticStationDao extends JpaRepository<DiagnosticStation, Long> {

//    private QDiagnosticStation diagnosticStation = QDiagnosticStation.diagnosticStation;
//
//    public DiagnosticStation findOne(Long id) {
//        return queryFactory.selectFrom(diagnosticStation)
//                .where(diagnosticStation.id.eq(id))
//                .fetchOne();
//    }
//
//    public List<DiagnosticStation> findAll() {
//        return queryFactory.select(diagnosticStation).from(diagnosticStation).fetch();
//    }
//
//    public void add(DiagnosticStation pic) {
//        //queryFactory.insert
//    }
//
//    public void remove(Long id) {
//        queryFactory.delete(diagnosticStation)
//                .where(diagnosticStation.id.eq(id))
//                .execute();
//    }
//
//    public void update(DiagnosticStation newStation, Long id) {
//        queryFactory.update(diagnosticStation)
//                .where(diagnosticStation.id.eq(id))
//                .set(diagnosticStation, newStation)
//                .execute();
//    }
}
