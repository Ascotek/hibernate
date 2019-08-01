package hibernate;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "receipt_product")
public class ReceiptProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    @ManyToMany (mappedBy = "receipt_product", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Product> products;

    @ManyToMany (mappedBy = "receipt_product", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Receipt> receipts;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceiptProduct that = (ReceiptProduct) o;
        return Objects.equals(products, that.products) &&
                Objects.equals(receipts, that.receipts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, receipts);
    }

    @Override
    public String toString() {
        return "ReceiptProduct{" +
                "products=" + products +
                ", receipts=" + receipts +
                '}';
    }
}
