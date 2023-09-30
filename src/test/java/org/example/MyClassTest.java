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

    @Test
    public void testFahrenheitToCelsius() {
        MyClass myClass = new MyClass();
        double celsius = myClass.fahrenheitToCelsius(32);
        assertEquals(0.0, celsius, 0.01);
    }

    @Test
    public void testConcatenateArrays() {
        MyClass myClass = new MyClass();
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = myClass.concatenateArrays(arr1, arr2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, result);
    }

    @Test
    public void testFactorial() {
        MyClass myClass = new MyClass();
        assertEquals(1, myClass.factorial(0));
        assertEquals(1, myClass.factorial(1));
        assertEquals(120, myClass.factorial(5));
    }

    @Test
    public void testIsPalindrome() {
        MyClass myClass = new MyClass();
        assertTrue(myClass.isPalindrome("racecar"));
        assertFalse(myClass.isPalindrome("hello"));
    }

    @Test
    public void testFindLongestWordLength() {
        MyClass myClass = new MyClass();
        assertEquals(5, myClass.findLongestWordLength("The quick brown fox jumps over the lazy dog"));
    }

    // Write tests for more methods...
}
