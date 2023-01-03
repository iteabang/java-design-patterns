package kr.iteabang.constructor;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    // synchronized
    public static synchronized Singleton2 getInstance() {
        if (instance == null) instance = new Singleton2(); // Lazy Initialization(늦은 초기화)
        return instance;
    }

}
