package thirdtask;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrimeFactors {

    private int value;
    private static PrimeFactors primeFactors;

    private PrimeFactors() {
    }

    public static PrimeFactors getInstance() {
        if (primeFactors == null) {
            primeFactors = new PrimeFactors();
        }
        return primeFactors;
    }

    public int scanEnteredString(Scanner scanner) {
        System.out.println("Введите целое число");
        try {
            value = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Введено не целое число: " + e);
        }
        return value;
    }

    public void generatePrimeFactors(int value, int n) {
        if (n > value) return;
        if (value % n == 0) {
            System.out.println(n);
            while (value % n == 0) {
                value = value / n;
            }
        }
        generatePrimeFactors(value, n + 1);
    }
}
