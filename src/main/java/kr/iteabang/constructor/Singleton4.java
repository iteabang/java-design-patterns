package kr.iteabang.constructor;

public class Singleton4 {

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return LazyLoading.INSTANCE;
    }

    // Double Checking Locking(DCL, Thread-Safe)
    private static class LazyLoading {
        private static final Singleton4 INSTANCE = new Singleton4(); // Lazy Initialization(늦은 초기화)
    }
}
