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
    private String name = "";

    @Column(name = "pet_kind")
    private int kind = 0;

    @Column(name = "pet_age")
    private int age = 0;

    @Column(name = "pet_vaccination")
    private Boolean vaccination = false;

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getVaccination() {
        return vaccination;
    }

    public void setVaccination(Boolean vaccination) {
        this.vaccination = vaccination;
    }
}
