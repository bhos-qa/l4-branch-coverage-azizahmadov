package org.example;

public class MyClass {
    // Method 1
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }
    // Method 3
    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Method 4
    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Method 5
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 6
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method 7
    public int[] concatenateArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    // Method 8
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method 9
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Method 10
    public int findLongestWordLength(String sentence) {
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }
        return maxLength;
    }

}
