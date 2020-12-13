package ru.mtuci.progtech;

// Лабораторная работа No 7. Обработка текстовых строк
// A17. Напечатать все слова, состоящие только из латинских букв.

public class Lab7 {
    static String Del = "[\\s,.:;?!\\n\\t]+";

    public static void main(String[] args) {
        String s;

        s = Utilities.readString();
        String[] words = s.split(Del);
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
            }
        }

    }
}
