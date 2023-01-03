package kr.iteabang.constructor;

public class Singleton1 {

    private static Singleton1 instance = new Singleton1(); // Eager Initialization(이른 초기화)

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }

}
