/*
 * This program demonstrates method overloading in Java.
 * This multiUse method behaves differently depending on how many arguments are passed:
 *  - One integer: prints numbers from 1 to that value
 *  - Two integers: calculates and prints their average
 *  - Three integeers: finds a prints the max value
 */

public class OverloadDemo {

    public static void main(String[] args) {
        multiUse(17);
        multiUse(10, 15);
        multiUse(3, 8, 6);
    }

    public static void multiUse(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void multiUse(int a, int b) {
        double average = (a + b) / 2.0;
        System.out.println("Average: " + average);
    }

    public static void multiUse(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Maximum: " + max);
    }
}