package pl.engine.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.engine.model.base.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Vehicle extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
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
                ", secret='" + secret + '\'' +
                '}';
    }
}
