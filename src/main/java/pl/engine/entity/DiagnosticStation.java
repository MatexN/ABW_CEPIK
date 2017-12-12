package pl.engine.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.engine.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "T_DIAGNOSTIC_STATION")
@NoArgsConstructor
public class DiagnosticStation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String local;

    @OneToMany(mappedBy = "diagnosticStation")
    private List<Inspection> inspections = new ArrayList<>();

}
