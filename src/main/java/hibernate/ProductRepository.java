package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDateTime;
import java.util.*;


public class ProductRepository {

//    public void createStoreId(){
//        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
//            Transaction transaction = session.beginTransaction();
//
//            Store store = session.find(Store.class, 1l);
//            Receipt receipt = new Receipt(1l, "05.05.2005");
//            store.getReceipts().add(receipt);
//
//            session.getTransaction().commit();
//            transaction.commit();
//
//        }
//    }

//    public void createProduct(){
//        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            Receipt receipt = new Receipt();
//            receipt.setCreationDate("22.07.2018");
//            Product product = new Product();
//            product.setName("broń");
//            product.setPrice(1089);
//            product.setCreationDate("23.06.2019");
//
//            Product product1 = new Product();
//            product1.setName("piłka");
//            product1.setPrice(120.35);
//            product1.setCreationDate("06.05.2019");
//
//            Product  product2 = new Product();
//            product2.setName("farba");
//            product2.setPrice(20.50);
//            product2.setCreationDate("03.09.2018");
//
//            Set<Product> products = new HashSet<>();
//            products.add(product);
//            products.add(product1);
//            products.add(product2);
//
//            receipt.setProducts(products);
//
////            Product product = new Product();
////            product.setName("broń");
////            product.setPrice(1089);
////            product.setCreationDate("23.06.2019");
////            session.persist(product);
////
////            Product product1 = new Product();
////            product1.setName("piłka");
////            product1.setPrice(120.35);
////            product1.setCreationDate("12.11.2018");
////            session.persist(product1);
//
//            transaction.commit();
//        }
//    }
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



//            Store store = new Store();
//            store.setName("świat broni");
//            store.setCity("Białystok");
//            store.setStreet("Misia 91");
//            store.setId(1l);
//            session.persist(store);
//
//            Receipt receipt1 = new Receipt();
//            receipt1.setCreationDate("26.03.2017");
//            Store store1 = session.find(Store.class, 1L);
//            store1.setId(2L);
//            session.persist(receipt1);


            session.getTransaction().commit();
            transaction.commit();
        }
    }
//    public void update(){
//        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            Receipt receipt = session.find(Receipt.class, 1L);
//            System.out.println(receipt);
//            System.out.println(receipt.getProducts());
//            Product product = new Product();
//            product.setName("miecz");
//            Store store = new Store();
//            store.setCity("Białystok");
//            store.setName("Broniowo");
//
////            receipt.setStoreList(Collections.singletonList(store));
//            session.persist(receipt);
//
//            transaction.commit();
//        }
//    }





}
