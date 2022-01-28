package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
         /*
            1.	Write a program that inputs 2 integers and outputs the sum of the numbers.
         */
        Scanner scanner = new Scanner(System.in);

        int numOne, numTwo;

        System.out.print("Input first number: ");
        numOne = scanner.nextInt();

        System.out.print("Input second number: ");
        numTwo = scanner.nextInt();

        int sum = numOne + numTwo;

        System.out.printf("The sum is = %d",sum);
    }
}
