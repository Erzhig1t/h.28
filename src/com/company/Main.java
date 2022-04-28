package com.company;

import java.util.Scanner;
import java.util.function.UnaryOperator;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        // write your code here
        UnaryOperator unaryOperator = (x, y) -> x;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(Math.sqrt(a));
    }

    @FunctionalInterface
    interface UnaryOperator{
        double sqrt(int a, int b);

    }
}

