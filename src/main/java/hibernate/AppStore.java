package hibernate;


public class AppStore {
    public static void main(String[] args) {
        try{
           //ProductRepository productRepository = new ProductRepository();
           //productRepository.createProduct();
            ///productRepository.createStore();
            //productRepository.createReceipt();
          //productRepository.createSampleProduct();

         //productRepository.update();

           // productRepository.createStoreId();


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            SessionStoreBuilder.getInstance().close();
        }
    }
}
