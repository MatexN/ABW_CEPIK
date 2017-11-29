package pl.engine.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.engine.model.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class DiagnosticStation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String street;
    private String local;
    @OneToMany(mappedBy = "diagnosticStation")
    private List<Inspection> inspections = new ArrayList<>();

    @Override
    public String toString(){
        return street + " " + local;
    }

}
