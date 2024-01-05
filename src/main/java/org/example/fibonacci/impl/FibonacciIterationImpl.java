package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

public class FibonacciIterationImpl implements Fibonacci {
    /*
    The time complexity of the Fibonacci method using the iterative approach is O(n), where n is the input number.
    This is because the method uses a loop that iterates from 2 to num to calculate the Fibonacci number iteratively.
    In each iteration, the method calculates the next Fibonacci number by adding the previous two numbers
    (first and second) and updates the values of first, second, and next. Since the loop iterates num - 1 times,
    the time complexity is linear with respect to the input size.
    which means it requires constant space. This is because the method only uses a few variables
    (first, second, next, and i) to perform the calculations, and the space required by these variables does not
    depend on the input size. Regardless of the input number, the space usage remains constant,
    resulting in a constant space complexity.
    */
    @Override
    public long fibonacci(int num) {
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
