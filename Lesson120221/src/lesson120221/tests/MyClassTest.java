package lesson120221.tests;

import lesson120221.code.MyClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest extends Assertions {
    @Test
    public void firstTest()
    {
        // Prepare
        // Action
        // Check

        MyClass myClass = new MyClass();

        int result = myClass.add(10);

        assertEquals(12, result);
    }
}
