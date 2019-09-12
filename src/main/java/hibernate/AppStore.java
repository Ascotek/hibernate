package hibernate;


import java.util.*;

public class AppStore {
    public static void main(String[] args) {
        try {
            ProductRepository productRepository = new ProductRepository();

//            Store store = new Store();
//            store.setCity("Białystok");
//            store.setStreet("Mysia 34");
//            store.setName("Broniowo");
//            Receipt receipt = new Receipt();
//            receipt.setCreationDate("25.01.2017");
//            receipt.setStore(store);
//            productRepository.save(receipt);
//
//            Store store1 = new Store();
//            store1.setCity("Białystok");
//            store1.setStreet("Młynowa");
//            store1.setName("Społem");
//            Receipt receipt1 = new Receipt();
//            receipt1.setCreationDate("16.03.2019");
//            receipt1.setStore(store1);
//            productRepository.save(receipt1);
//
//            Store store2 = new Store();
//            store2.setCity("Kraków");
//            store2.setStreet("Kocia 67");
//            store2.setName("Rosek");
//            Receipt receipt2 = new Receipt();
//            receipt2.setCreationDate("01.08.2019");
//            receipt2.setStore(store2);
//            productRepository.save(receipt2);
//
//            Store store3 = new Store();
//            store3.setCity("Wrocław");
//            store3.setStreet("Łysa 6");
//            store3.setName("Sportex");
//            Receipt receipt3 = new Receipt();
//            receipt3.setCreationDate("05.06.2019");
//            receipt3.setStore(store3);
//            productRepository.save(receipt3);                                     //drugie polecenie - tworzenie store

            //productRepository.createProduct();                                 //pierwsze polecenie

//            List<Product> list = productRepository.findByProduct("broń");       //trzecie polecenie szukanie productu
//            for (Product product : list) {
//                System.out.println(product);
//            }
//            List<Product> list1 = productRepository.findByDate("05.06.2019");       //czwarte polecenie szukanie wg daty
//            for (Product product : list1) {
//                System.out.println(product);
//            }

            System.out.println("Najwyższa cena w produchtach to: " + productRepository.findExpensiveProduct() + " złotych.");   //szukanie najwyzszej ceny

            productRepository.creatReceiptProduct();  //polaczenie dwoch tabel Receipt_Product


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SessionStoreBuilder.getInstance().close();
        }
    }
}
