package org.example.fibonacci.impl;

import org.example.fibonacci.Fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgrammingImpl implements Fibonacci {
    /*
    The time complexity of the Fibonacci method using dynamic programming is O(n), where n is the input number.
    This is because the method uses memoization to store previously calculated Fibonacci numbers in the storage map.
    When calculating the Fibonacci number for a given num, the method checks if it already exists in the storage map.
    If it does, it retrieves the value in constant time. Otherwise, it recursively calculates the Fibonacci number
    using the formula fibonacci(num - 1) + fibonacci(num - 2). Since each Fibonacci number is calculated only once and
    stored in the map, the method avoids redundant calculations, resulting in a linear time complexity.
    The space complexity of the Fibonacci method using dynamic programming is also O(n). This is because the storage
    map stores the Fibonacci numbers as key-value pairs, where the key is the input number num and the value is
    the corresponding Fibonacci number. The maximum number of entries in the storage map is equal to num,
    which grows linearly with the input. Therefore, the space required by the storage map is proportional to the input size,
    resulting in a linear space complexity.
    */
    private Map<Integer, Long> storage = new HashMap<>();

    @Override
    public long fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        if (storage.containsKey(num)) {
            return storage.get(num);
        }
        long nthFibonacciNum = fibonacci(num - 1) + fibonacci(num - 2);
        storage.put(num, nthFibonacciNum);
        return nthFibonacciNum;
    }
}
