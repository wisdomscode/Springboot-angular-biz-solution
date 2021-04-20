package servbyte.com.businesshub.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 40, nullable = false, unique = true)
    private String name;

    public City() {
    }

    public City(Integer id) {
        this.id = id;
    }

    public City(String name) {
        this.name = name;
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
}
