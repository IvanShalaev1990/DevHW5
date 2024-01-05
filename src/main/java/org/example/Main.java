package org.example;

import org.example.fibonacci.impl.FibonacciDynamicProgrammingImpl;
import org.example.fibonacci.impl.FibonacciIterationImpl;
import org.example.fibonacci.impl.FibonacciRecursionImpl;

public class Main {
    public static void main(String[] args) {
        long startIterations = System.currentTimeMillis();
        new FibonacciIterationImpl().fibonacci(30);
        long endtIterations = System.currentTimeMillis();
        System.out.println("Iteration - " + (endtIterations - startIterations));
        long startDynamicProgramming = System.currentTimeMillis();
        new FibonacciDynamicProgrammingImpl().fibonacci(30);
        long endtDynamicProgramming = System.currentTimeMillis();
        System.out.println("Dynamic Programming - " + (endtDynamicProgramming - startDynamicProgramming));
        long startRecursion = System.currentTimeMillis();
        new FibonacciRecursionImpl().fibonacci(30);
        long endRecursion = System.currentTimeMillis();
        System.out.println("Recursion - "+(endRecursion - startRecursion));
    }
}