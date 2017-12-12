package pl.engine.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import pl.engine.entity.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "T_OWNER")
public class Owner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstname;

    private String lastname;

    private String pesel;

    private String mail;

    @OneToMany(mappedBy = "owner")
    private List<VehicleOwner> vehicles = new ArrayList<>();
}
