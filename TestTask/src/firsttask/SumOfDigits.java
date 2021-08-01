package firsttask;

import java.util.Scanner;

import static java.lang.Character.*;

public class SumOfDigits {

    private static SumOfDigits sumOfDigits;

    private SumOfDigits() {
    }

    public static SumOfDigits getInstance() {
        if (sumOfDigits == null) {
            sumOfDigits = new SumOfDigits();
        }
        return sumOfDigits;
    }

    public String scanEnteredString(Scanner scanner) {
        System.out.println("Введите строку");
            return scanner.nextLine();
    }

    public int getSumOfDigits(String string) {

        int sum = 0;
        for (Character s : string.toCharArray()) {
            if (isDigit(s)) {
                sum = sum + getNumericValue(s);
            }
        }

        return sum;
    }
}
