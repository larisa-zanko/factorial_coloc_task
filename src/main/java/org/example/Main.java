package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter n(n>0): ");

        try {
            int n = scanner.nextInt();
            FactorialCalculator calculator = new FactorialCalculator();
            System.out.println("Firsts" + n + " factorials: " + calculator.calculateFactorials(n));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error happen: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}