package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.*;


public class ProductRepository {

    public void createProduct(){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            Transaction transaction = session.beginTransaction();
            Product bron = new Product();
            bron.setName("broń");
            bron.setCreationDate("16.03.2019");
            bron.setPrice(1000.50);
            session.persist(bron);
            Product product = new Product();
            product.setName("chleb");
            product.setCreationDate("01.08.2019");
            product.setPrice(3.40);
            session.persist(product);
            Product kosmetyk = new Product();
            kosmetyk.setName("fluid");
            kosmetyk.setCreationDate("05.06.2019");
            kosmetyk.setPrice(150.60);
            session.persist(kosmetyk);
            Product sport = new Product();
            sport.setName("piłka nożna");
            sport.setCreationDate("25.01.2017");
            sport.setPrice(200);
            session.persist(sport);

            Receipt receipt = new Receipt();

            Set<Product> products = new HashSet<>();
            products.add(bron);
            products.add(product);
            products.add(kosmetyk);
            products.add(sport);

            receipt.setProducts(products);
            session.save(receipt);

            transaction.commit();
        }
    }
    public void persit (Store store){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            session.beginTransaction();
            session.persist(store);
            session.getTransaction().commit();
        }
    }
    public void createReceipt(String creationDate, Store store){

        Receipt receipt = new Receipt();
        receipt.setCreationDate(creationDate);
        receipt.setStore(store);
        Session session = SessionStoreBuilder.getInstance().openSession();
        session.beginTransaction();
        session.persist(receipt);
        session.getTransaction().commit();
        session.close();

    }
    public void save(Store store){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            session.persist(store);
            session.getTransaction().commit();

        }
    }
    public void save(Receipt receipt){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            session.persist(receipt);
            session.getTransaction().commit();

        }
    }

    public void save(Product product){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            session.persist(product);
            session.getTransaction().commit();

        }
    }

}
