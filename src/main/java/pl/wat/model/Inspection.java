package pl.wat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inspection {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long vehicleid;
    private Long diagnosticstationid;
    private java.sql.Date date;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public Long getDiagnosticstationid() {
        return diagnosticstationid;
    }

    public void setDiagnosticstationid(Long diagnosticstationid) {
        this.diagnosticstationid = diagnosticstationid;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
