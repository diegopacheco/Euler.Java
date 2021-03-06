package com.gorauskas.euler.solutions;

import com.gorauskas.euler.Euler;

import java.util.stream.LongStream;

public class Euler6 implements Euler {

    @Override
    public double Solve() {
        var sumOfSqr = Math.pow((double)LongStream.rangeClosed(1, 100).sum(), 2.0);
        var sqrOfSum = (double)LongStream.rangeClosed(1, 100)
                .map(x -> (long)(Math.pow((double)x, 2.0)))
                .sum();

        return sumOfSqr - sqrOfSum;

        //return loopStrategy();
    }

    public double loopStrategy() {
        long sumOfSquares = 0;
        long squareOfSums = 0;
        long sum = 0;

        for (int i = 1; i < 101; i++) {
            sumOfSquares += (int)Math.pow(i, 2);
            sum += i;
        }

        squareOfSums = (long)Math.pow(sum, 2);
        return (double)squareOfSums - sumOfSquares;
    }

    @Override
    public String getProblem() {
        return new StringBuilder()
                .append("Project Euler Problem 6:\n")
                .append("\n")
                .append("   The sum of the squares of the first ten natural numbers is,\n")
                .append("\n")
                .append("   12 + 22 + ... + 102 = 385\n")
                .append("\n")
                .append("   The square of the sum of the first ten natural numbers is,\n")
                .append("\n")
                .append("   (1 + 2 + ... + 10)2 = 552 = 3025\n")
                .append("\n")
                .append("   Hence the difference between the sum of the squares of the \n")
                .append("   first ten natural numbers and the square of the sum is \n")
                .append("   3025  385 = 2640. \n")
                .append("\n")
                .append("   Find the difference between the sum of the squares of the \n")
                .append("   first one hundred natural numbers and the square of the sum.\n")
                .toString();
    }

    @Override
    public String getAnswer() {
        return String.format("The difference between the sum of the squares\n" +
                "and the square of the sum of the first 100 numbers\n" +
                "is: %s", (long)this.Solve());
    }
}
