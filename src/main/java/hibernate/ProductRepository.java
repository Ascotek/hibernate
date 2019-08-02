package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class ProductRepository {

    public void createProduct(){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            Transaction transaction = session.beginTransaction();

            Product product = new Product();
            product.setName("broń");
            product.setPrice(1089);
            product.setCreationDate("23.06.2019");
            session.persist(product);

            Product product1 = new Product();
            product1.setName("piłka");
            product1.setPrice(120.35);
            product1.setCreationDate("12.11.2018");
            session.persist(product1);

            transaction.commit();
        }
    }
    public void createStore(){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            Transaction transaction = session.beginTransaction();

            Store store = new Store();
            store.setName("świat broni");
            store.setCity("Białystok");
            store.setStreet("Misia 91");
            session.persist(store);

            Store store1 = new Store();
            store1.setName("Sport");
            store1.setCity("Kraków");
            store1.setStreet("Kwiatowa");
            session.persist(store1);



            transaction.commit();
        }
    }

    public void createSampleProduct(){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            Transaction transaction = session.beginTransaction();

            Receipt receipt = new Receipt();
            receipt.setCreationDate("23.06.2019");
            session.persist(receipt);

            Receipt receipt1 = new Receipt();
            receipt1.setCreationDate("06.05.2019");
            session.persist(receipt1);

            Store store = new Store();
            store.setName("świat broni");
            store.setCity("Białystok");
            store.setStreet("Misia 91");
            session.persist(store);

            Store store1 = new Store();
            store1.setName("Sport");
            store1.setCity("Kraków");
            store1.setStreet("Kwiatowa");
            session.persist(store1);


            List<Store> stores = new LinkedList<>();
            stores.add(store);
            stores.add(store1);


            Product product = new Product();
            product.setName("broń");
            product.setPrice(1089);
            product.setCreationDate("23.06.2019");
            session.persist(product);

            Product product1 = new Product();
            product1.setName("piłka");
            product1.setPrice(120.35);
            product1.setCreationDate("06.05.2019");
            session.persist(product1);

            transaction.commit();
        }
    }





}
