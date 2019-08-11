package hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "RECEIPT")
public class Receipt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String creationDate;

    @ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "STORE_ID")
    private Store store;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Receipt(Store store) {
        this.store = store;
    }

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "Receipt_Product",
            joinColumns = { @JoinColumn(name = "receipt_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )

   private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


    public Receipt(Long id, String creationDate) {
        this.id = id;
        this.creationDate = creationDate;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receipt receipt = (Receipt) o;
        return Objects.equals(id, receipt.id) &&
                Objects.equals(creationDate, receipt.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, creationDate);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                '}';
    }
}
