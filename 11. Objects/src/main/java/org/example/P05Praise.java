package org.example;

import java.util.Random;

public class P05Praise {
    private static final String[] phrases = new String[]{"Продуктът е отличен.", "Това е страхотен продукт.", "Постоянно ползвам този продукт.", "Това е най-добрият продукт от тази категория."};
    private static final String[] cases = new String[]{"Вече се чувствам добре.", "Успях да се променя.", "Той направи чудо.", "Не мога да повярвам, но вече се чувствам страхотно.", "Опитайте и вие. Аз съм много доволна."};
    private static final String[] authorsFirstName = new String[]{"Диана", "Петя", "Стела", "Елена", "Катя"};
    private static final String[] authorsSecondName = new String[]{"Иванова", "Петрова", "Кирова"};
    private static final String[] towns = new String[]{"София", "Пловдив", "Варна", "Русе", "Бургас"};

    public static void main(String[] args) {
        System.out.println(message());
    }
    private static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    private static String message() {
        return getRandomElement(phrases) + " " + getRandomElement(cases) +
                "\n" + getRandomElement(authorsFirstName) + " " + getRandomElement(authorsSecondName) + " от " + getRandomElement(towns);
    }
}
