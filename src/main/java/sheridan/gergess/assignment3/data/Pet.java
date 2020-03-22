package sheridan.gergess.assignment3.data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pet")
public class Pet implements Serializable {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pet_name")
    private String petName = "";

    @Column(name = "pet_kind")
    private int petKind = 0;

    @Column(name = "pet_age")
    private int petGender = 0;

    @Column(name = "pet_vaccination")
    private Boolean petVaccination = false;

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetKind() {
        return petKind;
    }

    public void setPetKind(int petKind) {
        this.petKind = petKind;
    }

    public int getPetGender() {
        return petGender;
    }

    public void setPetGender(int petGender) {
        this.petGender = petGender;
    }

    public Boolean getPetVaccination() {
        return petVaccination;
    }

    public void setPetVaccination(Boolean petVaccination) {
        this.petVaccination = petVaccination;
    }
}
