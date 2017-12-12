package pl.engine.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.engine.entity.base.BaseEntity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "T_VEHICLE")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Vehicle extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;

    private String model;

    private String vin;

    private String registrationnumber;

    private String enginenumber;

    private String category;

    private Double weight;

    private Double power;

    private Double capacity;

    private String secret;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleOwner> owners = new ArrayList<>();

    @OneToMany(mappedBy = "vehicle")
    private List<Inspection> inspections = new ArrayList<>();
}
