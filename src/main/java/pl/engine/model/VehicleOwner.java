package pl.engine.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.engine.model.base.BaseEntity;

import javax.persistence.*;

//@Embeddable
@Entity
@Table(name = "vehicle_owner")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class VehicleOwner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "vehicle_id", referencedColumnName = "id")
    private Vehicle vehicle;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

    @Override
    public String toString(){
        return vehicle.toString() + " " + owner.toString();
    }
}
