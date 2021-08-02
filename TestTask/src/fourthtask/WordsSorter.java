package fourthtask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsSorter {

    private static WordsSorter wordsSorter;

    private WordsSorter() {
    }

    public static WordsSorter getInstance() {
        if (wordsSorter == null) {
            wordsSorter = new WordsSorter();
        }
        return wordsSorter;
    }

    public String scanEnteredString(Scanner scanner) {
        System.out.println("Введите предложение кирилицей");
        String str = null;
        try {
            str = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Ошибка: введены неверные данные!");
        }
        return str;
    }

    private int getAmountVowelLetters(String word) {
        Pattern pattern = Pattern.compile("(?iu)[аеёиоуыэюя]");
        Matcher matcher = pattern.matcher(word.toLowerCase());
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;

    }

    private char[] firstVowelLettersUpperCase(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isVowelLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                break;
            }
        }
        return chars;

    }

    public static boolean isVowelLetter(char letter) {
        char[] vowels = new char[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        for (char vowel : vowels) {
            if (letter == vowel)
                return true;
        }
        return false;
    }

    public void sortWordsByAmountVowelLetters(String text) {
        text = text.replaceAll("[^а-яА-Я]", " ");
        String[] wordsArray = text.split("\\s+");

        Arrays.stream(wordsArray)
                .sorted((s1, s2) -> Integer.compare(getAmountVowelLetters(s2), getAmountVowelLetters(s1)))
                .forEach(word -> System.out.println(firstVowelLettersUpperCase(word)));
    }
}
