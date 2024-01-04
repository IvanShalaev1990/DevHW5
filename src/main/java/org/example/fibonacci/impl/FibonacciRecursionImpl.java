package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

public class FibonacciRecursionImpl implements Fibonacci {

    @Override
    public int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
