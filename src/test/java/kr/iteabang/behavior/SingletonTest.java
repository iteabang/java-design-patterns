package kr.iteabang.behavior;

import kr.iteabang.constructor.Singleton1;
import kr.iteabang.constructor.Singleton2;
import kr.iteabang.constructor.Singleton3;
import kr.iteabang.constructor.Singleton4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void instanceSameTest1() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

    @Test
    public void instanceSameTest2() {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

    @Test
    public void instanceSameTest3() {
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance2 = Singleton3.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

    @Test
    public void instanceSameTest4() {
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance2 = Singleton4.getInstance();
        Assertions.assertSame(instance1, instance2);
    }

}
