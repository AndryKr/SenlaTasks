import firsttask.SumOfDigits;
import sixthtask.SafeBoxOptimization;
import thirdtask.PrimeFactors;

import java.util.Scanner;

public class DoMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumOfDigits sumOfDigits = SumOfDigits.getInstance();
        PrimeFactors primeFactors = PrimeFactors.getInstance();
        SafeBoxOptimization safeBoxOptimization = SafeBoxOptimization.getInstance();


        //Решение задания №1
        System.out.println(sumOfDigits.getSumOfDigits(sumOfDigits.scanEnteredString(scanner)));
        System.out.println('\n');
        //Решение задания №2

        //Решение задания №3
        primeFactors.generatePrimeFactors(primeFactors.scanEnteredString(scanner), 2);
        System.out.println('\n');
        //Решение задания №4

        //Решение задания №5

        //Решение задания №6
        safeBoxOptimization.start();


        scanner.close();
    }
}
