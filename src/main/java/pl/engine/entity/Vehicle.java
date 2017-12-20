package pl.engine.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;
import pl.engine.entity.base.BaseEntity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Vehicle extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Size(max = 30)
    private String brand;

    @NotEmpty
    @Size(max = 30)
    private String model;

    @Size(min=5, max=20)
    @NotEmpty
    private String vin;

    @Size(max=30)
    @NotEmpty
    private String registrationnumber;

    private String enginenumber;

    @Size(max=5)
    @NotEmpty
    private String category;

    private Double weight;

    private Double power;

    private Double capacity;

    private Boolean secret;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleOwner> owners = new ArrayList<>();

    @OneToMany(mappedBy = "vehicle")
    private List<Inspection> inspections = new ArrayList<>();

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", vin='" + vin + '\'' +
                ", registrationnumber='" + registrationnumber + '\'' +
                ", enginenumber='" + enginenumber + '\'' +
                ", category='" + category + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                ", capacity=" + capacity +
                ", secret=" + secret +
                '}';
    }
}
