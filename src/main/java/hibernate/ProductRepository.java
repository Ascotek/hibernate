package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

//            Receipt receipt = new Receipt();
//
//            Set<Product> products = new HashSet<>();
//            products.add(bron);
//            products.add(product);
//            products.add(kosmetyk);
//            products.add(sport);
//
//            receipt.setProducts(products);
//            session.save(receipt);

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
    public List<Product> findByProduct(String name){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            Query<Product> query = session.createQuery("select s from Product s where s.name = :key", Product.class);
            query.setParameter("key", name);
            List<Product>list = query.list();
            session.getTransaction().commit();
            return list;
        }
    }
    public List<Product> findByDate(String creationDate){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            Query<Product> query = session.createQuery("select s from Product s where s.creationDate = :key", Product.class);
            query.setParameter("key", creationDate);
            List<Product>list = query.list();
            session.getTransaction().commit();
            return list;
        }
    }
    public List<Double> findExpensiveProduct(){
        try(Session session = SessionStoreBuilder.getInstance().openSession()){
            session.beginTransaction();
            Query<Double> query = session.createQuery("select MAX(price) from Product", Double.class);
            List<Double> products = query.list();
            session.getTransaction().commit();
            return  products;
        }
    }
    public void creatReceiptProduct(){
        try (Session session = SessionStoreBuilder.getInstance().openSession()) {
            Transaction transaction = session.beginTransaction();
            Product product1 = new Product();
            product1.setName("książka");
            session.persist(product1);
            Product product2 = new Product();
            product2.setName("komiks");
            session.persist(product2);

            List<Receipt>list = session.createQuery("from Receipt where creationDate in :creationDate", Receipt.class)
                    .setParameter("creationDate", Arrays.asList("01.08.2019", "'05.06.2019"))
                    .list();

            for(Receipt receipt : list){
                receipt.getProducts().add(product1);
                receipt.getProducts().add(product2);
                session.update(receipt);
            }
            System.out.println(list);

            transaction.commit();
        }
    }



}
