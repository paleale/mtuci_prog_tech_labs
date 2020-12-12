package ru.mtuci.progtech;

// Лабораторная работа No 5. Определение характеристик одномерных массивов
// Уровень А.
// A17. В массиве целых чисел найти количество простых чисел.

import java.lang.Math;
import java.util.Random;

public class Lab5 {
    static int A=1;
    static int B=100;

    /* вывод массива на экран */
    static void PrintArr(int a[], int n)
    {
        int i;
        for(i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
    }

    /* принадлежит ли число к простым числам */
    static boolean IsSimple(int a) {
        return a % 2 == 0;
    }

    public static void main(String[] args) {
        int i, count;
        // size of an array
        int N = 10;
        int a[] = new int[N];

        /* инициализация элементов массива a случайными числами в диапазоне
        от A до B */
        Random r = new Random();
        for(i = 0; i < N; i++) {
            a[i] = A + r.nextInt(100) % (B - A + 1);
        }

        PrintArr(a, N);

        for(i = count = 0; i < N; i++)
            if (IsSimple(a[i])){
                count++;
            }
        System.out.printf("\nCount = %d\n", count);
    }
}
