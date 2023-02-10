package pattern_Tasks;

public class LazySingleton {
    private static LazySingleton INSTANCE = null;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized(LazySingleton.class) {
                INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }
}

