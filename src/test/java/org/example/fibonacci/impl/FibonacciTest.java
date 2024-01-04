package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {
    private final Fibonacci fibonacciIteration = new FibonacciIterationImpl();
    private final Fibonacci fibonacciRecursion = new FibonacciRecursionImpl();
    private final Fibonacci fibonacciDynamicProgramming = new FibonacciDynamicProgrammingImpl();

    @ParameterizedTest
    @Order(1)
    @CsvSource({"0,0", "1,1","2,1","3,2","4,3","5,5","6,8","7,13","8,21","9,34","10,55"})
    void testThatFibonacciIterationMethodWorkCorrectly(int input, int expected) {
        int actualValue = fibonacciIteration.fibonacci(input);
        Assertions.assertEquals(actualValue,expected);
    }
    @ParameterizedTest
    @Order(2)
    @CsvSource({"0,0", "1,1","2,1","3,2","4,3","5,5","6,8","7,13","8,21","9,34","10,55"})
    void testThatFibonacciRecursionMethodWorkCorrectly(int input, int expected) {
        int actualValue = fibonacciRecursion.fibonacci(input);
        Assertions.assertEquals(actualValue,expected);
    }
    @ParameterizedTest
    @Order(3)
    @CsvSource({"0,0", "1,1","2,1","3,2","4,3","5,5","6,8","7,13","8,21","9,34","10,55"})
    void testThatFibonacciDynamicProgrammingMethodWorkCorrectly(int input, int expected) {
        int actualValue = fibonacciDynamicProgramming.fibonacci(input);
        Assertions.assertEquals(actualValue,expected);
    }
}