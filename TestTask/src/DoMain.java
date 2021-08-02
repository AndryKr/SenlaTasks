import fifthtask.ArtDigits;
import firsttask.SumOfDigits;
import fourthtask.WordsSorter;
import secondtask.model.Vector;
import secondtask.service.VectorСalculator;
import sixthtask.SafeBoxOptimization;
import thirdtask.PrimeFactors;

import java.util.Scanner;

public class DoMain {

    public static void main(String[] args) {
        SumOfDigits sumOfDigits = SumOfDigits.getInstance();
        VectorСalculator vectorСalculator = VectorСalculator.getInstance();
        PrimeFactors primeFactors = PrimeFactors.getInstance();
        WordsSorter wordsSorter = WordsSorter.getInstance();
        ArtDigits artDigits = ArtDigits.getInstance();
        SafeBoxOptimization safeBoxOptimization = SafeBoxOptimization.getInstance();

        try (Scanner scanner = new Scanner(System.in)) {
            //Решение задания №1
            System.out.println(sumOfDigits.getSumOfDigits(sumOfDigits.scanEnteredString(scanner)));
            System.out.println('\n');
            //Решение задания №2
            Vector firstVector =  new Vector(3,5, 8, 9);
            Vector secondVector = new Vector(2, 6, 14, 11);

            System.out.println(vectorСalculator.getLength(firstVector));
            System.out.println(vectorСalculator.getLength(secondVector));

            vectorСalculator.getMultiplicationVector(firstVector, secondVector);
            vectorСalculator.getMultiplicationVector(secondVector, firstVector);
            System.out.println('\n');
            //Решение задания №3
            primeFactors.generatePrimeFactors(primeFactors.scanEnteredString(scanner), 2);
            System.out.println('\n');
            //Решение задания №4
            wordsSorter.sortWordsByAmountVowelLetters(wordsSorter.scanEnteredString(scanner));
            System.out.println('\n');
            //Решение задания №5
            artDigits.draw(scanner);
            System.out.println('\n');
            //Решение задания №6
            safeBoxOptimization.start();
        }
    }
}
