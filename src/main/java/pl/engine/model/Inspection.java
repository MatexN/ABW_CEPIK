package pl.engine.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.engine.model.base.BaseEntity;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor

public class Inspection extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "vehicle_id", referencedColumnName = "id")
    private Vehicle vehicle;
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "diagnosticstation_id", referencedColumnName = "id")
    private DiagnosticStation diagnosticStation;
    private java.sql.Date date;
    private String description;

    @Override
    public String toString() {
        return diagnosticStation.toString() + "\n" + 
                "\n" + date + "\n" + description;
    }

}
