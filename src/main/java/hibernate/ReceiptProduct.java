//package hibernate;
//
//
//import javax.persistence.*;
//import java.util.Objects;
//
//@Entity
//@Table(name = "receipt_prod")
//public class ReceiptProduct {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY )
//
//    @Column(name = "poduct_id")
//    private int idProduct;
//    @Column(name="receipt_id")
//    private int idReceipt;
//
//    public int getIdProduct() {
//        return idProduct;
//    }
//
//    public void setIdProduct(int idProduct) {
//        this.idProduct = idProduct;
//    }
//
//    public int getIdReceipt() {
//        return idReceipt;
//    }
//
//    public void setIdReceipt(int idReceipt) {
//        this.idReceipt = idReceipt;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        ReceiptProduct that = (ReceiptProduct) o;
//        return idProduct == that.idProduct &&
//                idReceipt == that.idReceipt;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(idProduct, idReceipt);
//    }
//
//    @Override
//    public String toString() {
//        return "ReceiptProduct{" +
//                "idProduct=" + idProduct +
//                ", idReceipt=" + idReceipt +
//                '}';
//    }
//}
