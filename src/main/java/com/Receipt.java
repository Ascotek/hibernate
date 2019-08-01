package com;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "receipt")
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    @Column(name = "receipt_id")
    private Long id;

    @Column(name= "store_id")
    private String store;

    private Long creationDate;

    @OneToMany (cascade = CascadeType.MERGE)
    @JoinColumn(name = "store")
    private List<Store> storeList;

    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<ReceiptProduct> receiptProducts;

    public Set<ReceiptProduct> getReceiptProducts() {
        return receiptProducts;
    }

    public void setReceiptProducts(Set<ReceiptProduct> receiptProducts) {
        this.receiptProducts = receiptProducts;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
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
