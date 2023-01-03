package kr.iteabang.behavior;

import kr.iteabang.constructor.Singleton1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Singleton1Test {

    @Test
    public void instanceSameTest() {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        Assertions.assertSame(instance1, instance2);
    }




}
