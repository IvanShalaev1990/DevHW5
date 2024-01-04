package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

public class FibonacciIterationImpl implements Fibonacci {
    @Override
    public int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        int first = 0;
        int second = 1;
        int next = 0;
        for (int i = 2; i <= num; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }
}
