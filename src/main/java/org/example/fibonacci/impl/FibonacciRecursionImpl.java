package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

public class FibonacciRecursionImpl implements Fibonacci {
    /*
    The time complexity of the Fibonacci method using the naive recursive approach is exponential,
    specifically O(2^n), where n is the input number. This is because for each recursive call,
    the method makes two additional recursive calls with num - 1 and num - 2 as arguments. As a result,
    the number of recursive calls grows exponentially with the input number, leading to an exponential time complexity.
    The space complexity of the Fibonacci method using the naive recursive approach is also exponential, specifically O(n),
    where n is the depth of the recursive call stack. This is because for each recursive call,
    the method adds a new frame to the call stack, which requires additional memory.
    Since the depth of the call stack is equal to the input number num, the space required by the call stack grows
    linearly with the input, resulting in an exponential space complexity.
    */

    @Override
    public long fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
