package ru.mtuci.progtech;

// Лабораторная работа No 1. Программирование циклических вычислительных процессов
// Уровень А.
// A17. Сумма таких значений функции, которые по модулю больше числа М.

import java.lang.Math;
import java.lang.System;

public class Lab1 {
    public static double A=-5;
    public static double B=5;

    static double H=0.1;
    static double x, y;
    static double sum = 0;
    // M = any value
    static int M = 34;

    // Метод F() вычисляет значение функции f(x) = xe^x + 2sin(x) - sqrt(|x^3 - x^2|)
    public static double F(double x) {
        return x * Math.pow(Math.exp(x), x) + 2 * Math.sin(x) - Math.sqrt(Math.abs(Math.pow(x, 3) - Math.pow(x, 2)));
    }

    public static void main(String[] args) {
        System.out.println("Аргумент  Значение функции");
        for (x = A; x <= B; x += H) {
            y = F(x);
            System.out.printf("%10.4f %10.4f\n", x, y);
            if (Math.abs(y) < M)
            {
                sum += Math.abs(y);
            }
        }
        System.out.printf("Сумма значений функции, которые по модулю меньше М = %d: %10.4f\n", M, sum);
    }
}
