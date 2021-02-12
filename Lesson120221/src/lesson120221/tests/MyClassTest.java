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

        assertEquals(11, result);
    }

    @Test
    public void secondTest()
    {
        MyClass myClass = new MyClass();

        Throwable res = assertThrows(ArithmeticException.class, () -> myClass.throwsException());
        assertEquals("Test exception", res.getMessage());
    }
    // <тестируемый метод>_<ситуация>_<ожидаемый результат>
}
