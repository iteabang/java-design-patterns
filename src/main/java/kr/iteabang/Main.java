package kr.iteabang;

import kr.iteabang.constructor.Singleton1;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1.equals(singleton2));
    }
}