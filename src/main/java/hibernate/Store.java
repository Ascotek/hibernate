package hibernate;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "STORE")
public class Store{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "STORE_ID")
    private Long id;
    private String name;
    private String city;
    private String street;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Store() {
    }

    public Store(Long id, String name, String city, String street) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(name, store.name) &&
                Objects.equals(city, store.city) &&
                Objects.equals(street, store.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, street);
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
