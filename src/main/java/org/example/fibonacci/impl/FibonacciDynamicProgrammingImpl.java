package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgrammingImpl implements Fibonacci {
    private Map<Integer, Integer> storage = new HashMap<>();

    @Override
    public int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        if (storage.containsKey(num)) {
            return storage.get(num);
        }
        int nthFibonacciNum = fibonacci(num - 1) + fibonacci(num - 2);
        storage.put(num, nthFibonacciNum);
        return nthFibonacciNum;
    }
}
