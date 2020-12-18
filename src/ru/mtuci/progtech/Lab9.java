package ru.mtuci.progtech;

// Лабораторная работа No 9. Рекурсия
// A17. В массиве целых чисел с помощью рекурсивной функции найти количество элементов, начинающихся на 3.

import java.util.Random;

public class Lab9 {
    static int x = 3;
    static int offset, count = 0;

    static void InitArr(int[] a, int N, int A, int B) {
        // инициализация элементов массива a случайными числами в диапазоне
        // от A до B
        Random r = new Random();
        for(int i = 0; i < N; i++) {
            a[i] = A + r.nextInt(100) % (B - A + 1);
        }
    }

    /* проверка, совпадает ли первая цифра числа a с 'x' */
    static boolean StandardCheck(int a) {
        int b = Math.abs(a);
        while (b > 9)
            b /= 10;
        return (b == x);
    }

    /* итеративная функция, вычисляющая количество таких элементов масси-
ва, первая цифра которых совпадает с 'x' */
    static int IterCount(int[] a, int n) {
        int count;
        for(int i = count = 0; i < n; i++)
            if (StandardCheck(a[i])) {
                count++;
            }
        return count;
    }

    /* рекурсивная функция, вычисляющая количество таких элементов масси-
ва, первая цифра которых совпадает с последней */
    static int RecoCount(int[] a) {
        if (a.length > offset) {
            if (StandardCheck(a[offset])) {
                count++;
            }
            offset++;
            RecoCount(a);
        }
        return count;
    }

    public static void main(String[] args) {
        int N = 10;
        int A = -50;
        int B = 50;
        int[] a;
        a = new int[N];

        InitArr(a, N, A, B);
        Lab5.PrintArr(a, N);
        System.out.printf("\nКоличество элементов массива, 1-я цифра которых совпадает с цифрой \"%d\"", x);
        System.out.printf("\nНайдено с помощью итерации: %d\n", IterCount(a, N));
        System.out.printf("Найдено с помощью рекурсии: %d\n", RecoCount(a));
    }
}
