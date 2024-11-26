package org.example;

import java.util.List;

    public class FactorialCalculatorTest {

        public static void main(String[] args) {
            runTests();
        }

        private static void runTests() {
            testCalculateFactorials_ValidInput();
            testCalculateFactorials_SingleInput();
            testCalculateFactorials_LargeInput();
            testCalculateFactorials_ZeroInput();
            testCalculateFactorials_NegativeInput();
        }

        private static void testCalculateFactorials_ValidInput() {
            FactorialCalculator calculator = new FactorialCalculator();
            List<Long> result = calculator.calculateFactorials(5);
            if (!result.equals(List.of(1L, 2L, 6L, 24L, 120L))) {
                System.err.println("testCalculateFactorials_ValidInput failed: Expected [1, 2, 6, 24, 120], but got " + result);
            } else {
                System.out.println("testCalculateFactorials_ValidInput passed");
            }
        }

        private static void testCalculateFactorials_SingleInput() {
            FactorialCalculator calculator = new FactorialCalculator();
            List<Long> result = calculator.calculateFactorials(1);
            if (!result.equals(List.of(1L))) {
                System.err.println("testCalculateFactorials_SingleInput failed: Expected [1], but got " + result);
            } else {
                System.out.println("testCalculateFactorials_SingleInput passed");
            }
        }

        private static void testCalculateFactorials_LargeInput() {
            FactorialCalculator calculator = new FactorialCalculator();
            List<Long> result = calculator.calculateFactorials(10);
            if (!result.equals(List.of(1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L))) {
                System.err.println("testCalculateFactorials_LargeInput failed: Expected [1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800], but got " + result);
            } else {
                System.out.println("testCalculateFactorials_LargeInput passed");
            }
        }

        private static void testCalculateFactorials_ZeroInput() {
            FactorialCalculator calculator = new FactorialCalculator();
            try {
                calculator.calculateFactorials(0);
                System.err.println("testCalculateFactorials_ZeroInput failed: Expected IllegalArgumentException for input 0");
            } catch (IllegalArgumentException e) {
                System.out.println("testCalculateFactorials_ZeroInput passed");
            }
        }

        private static void testCalculateFactorials_NegativeInput() {
            FactorialCalculator calculator = new FactorialCalculator();
            try {
                calculator.calculateFactorials(-3);
                System.err.println("testCalculateFactorials_NegativeInput failed: Expected IllegalArgumentException for negative input");
            } catch (IllegalArgumentException e) {
                System.out.println("testCalculateFactorials_NegativeInput passed");
            }
        }
    }