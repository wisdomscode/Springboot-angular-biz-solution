package servbyte.com.businesshub.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Business implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false, unique = true)
    private String name;

    @Column(length = 200, nullable = false, unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    private String phoneNumber;
    private String logo;
    private String category;

    public Business() {
    }

    public Business(String name, String email, City city, String phoneNumber, String logo, String category) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.logo = logo;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public City getState() {
        return city;
    }

    public void setState(City city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city=" + city +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", logo='" + logo + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
