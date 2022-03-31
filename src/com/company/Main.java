package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write a program to calculate and print average (or mean) of the stream of given numbers.
        // write the code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
            count++;
        }
        System.out.println(sum / count);
    }
}
