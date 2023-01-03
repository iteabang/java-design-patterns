package kr.iteabang.constructor;

public class Singleton3 {

    // Double Checking Locking(DCL, Thread-Safe)

    // volatile
    // 원자적 연산(안정적 통신) 보장
    private volatile static Singleton3 instance = null;

    private Singleton3() {

    }

    // synchronized
    // 비원자적 연산(배타적 실행 + 안정적 통신) 보장
    public static synchronized Singleton3 getInstance() {
        if (instance != null) return instance;
        synchronized (Singleton3.class) {
            if (instance == null) instance = new Singleton3();
        }
        return instance;
    }

}