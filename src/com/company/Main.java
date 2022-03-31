package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
