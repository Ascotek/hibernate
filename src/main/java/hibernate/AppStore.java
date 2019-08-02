package hibernate;


public class AppStore {
    public static void main(String[] args) {
        try{
            ProductRepository productRepository = new ProductRepository();
           // productRepository.createProduct();
            //productRepository.createStore();
            //productRepository.createReceipt();
            productRepository.createSampleProduct();


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            SessionStoreBuilder.getInstance().close();
        }
    }
}
