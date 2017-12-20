package pl.engine.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import pl.engine.entity.base.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
public class Owner extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @NotEmpty
    @Size(min = 10, max = 12)
    private String pesel;

    @Email(message = "Nieprawidłowy email")
    private String mail;

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", pesel='" + pesel + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    @OneToMany(mappedBy = "owner")
    private List<VehicleOwner> vehicles = new ArrayList<>();
}
