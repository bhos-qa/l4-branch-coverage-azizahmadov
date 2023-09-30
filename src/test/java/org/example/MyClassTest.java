package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class MyClassTest {
    @Test
    void testAdd() {
        MyClass myClass = new MyClass();
        int result = myClass.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testConcatenate() {
        MyClass myClass = new MyClass();
        String result = myClass.concatenate("Hello, ", "world!");
        assertEquals("Hello, world!", result);
    }

    @Test
    public void testCalculateRectangleArea() {
        MyClass myClass = new MyClass();
        double area = myClass.calculateRectangleArea(5.0, 3.0);
        assertEquals(15.0, area, 0.01); // Use delta for floating-point comparisons
    }

    @Test
    public void testFindMax() {
        MyClass myClass = new MyClass();
        int max = myClass.findMax(7, 12);
        assertEquals(12, max);
    }

    @Test
    public void testIsEven() {
        MyClass myClass = new MyClass();
        assertTrue(myClass.isEven(4));
        assertFalse(myClass.isEven(7));
    }

}
