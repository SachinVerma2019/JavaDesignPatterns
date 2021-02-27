package creational;

public class Singleton {

    private Singleton(){
        System.out.println("instance created");
    };

    //Eager
    //private static Singleton instance = new Singleton();


    private static Singleton instance ;
    public static Singleton getInstance () {

        //double-check locking
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    Singleton instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
