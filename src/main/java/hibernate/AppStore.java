package hibernate;


public class AppStore {
    public static void main(String[] args) {
        try{

        }catch (Exception e){
            e.printStackTrace();
        }finally{
            SessionStoreBuilder.getInstance().close();
        }
    }
}
