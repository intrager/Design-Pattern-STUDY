package singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    // Double Checked locking
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
