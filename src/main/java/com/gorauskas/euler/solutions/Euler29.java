package com.gorauskas.euler.solutions;

import com.gorauskas.euler.Euler;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Euler29 implements Euler {
    @Override
    public double Solve() {

        return IntStream.rangeClosed(2, 100)
                        .mapToObj(BigInteger::valueOf)
                        .flatMap(i -> IntStream.rangeClosed(2, 100)
                                .mapToObj(BigInteger::valueOf)
                                .map(j -> i.pow(j.intValue())))
                        .distinct()
                .count();

    }

    @Override
    public String getProblem() {
        return new StringBuilder()
                .append("Project Euler Problem 29\n")
                .append("\n")
                .append("    Consider all integer combinations of a^b for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:\n")
                .append("\n")
                .append("        2^2=4, 2^3=8, 2^4=16, 2^5=32\n")
                .append("        3^2=9, 3^3=27, 3^4=81, 3^5=243\n")
                .append("        4^2=16, 4^3=64, 4^4=256, 4^5=1024\n")
                .append("        5^2=25, 5^3=125, 5^4=625, 5^5=3125\n")
                .append("\n")
                .append("    If they are then placed in numerical order, with any repeats removed, we get the\n")
                .append("    following sequence of 15 distinct terms:\n")
                .append("\n")
                .append("        4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125\n")
                .append("\n")
                .append("    How many distinct terms are in the sequence generated by a^b for 2 ≤ a ≤ 100\n")
                .append("    and 2 ≤ b ≤ 100?\n")
                .toString();
    }

    @Override
    public String getAnswer() {
        return String.format("There are %s distinct terms in the sequence.\n", (long)this.Solve());
    }
}