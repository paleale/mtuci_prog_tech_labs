package ru.mtuci.progtech;

// Лабораторная работа No 8. Обработка и модификация двумерных массивов
// A17. Найти количество простых чисел каждой строки матрицы a(5, 7) и
// сохранить их в одномерном массиве b.

import java.util.Random;

public class Lab8 {

    /* инициализация элементов двумерной матрицы a случайными числами в диапазоне
от A до B */
    static void InitA(int[][] arr, int n, int m, int a, int b) {
        Random r = new Random();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = a + r.nextInt(100) % (b - a + 1);
            }
        }
    }

    /* вывод матрицы A на экран */
    static void PrintA(int[][] arr, int n, int m) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.printf("%d   ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /* вычисление значений элементов массива b */
    static void InitB(int[][] arr, int m, int n, int[] b)
    {
        int count;
        for(int i = 0; i < n; i++) {
            for(int j = count = 0; j < m; j++) {
                if (Lab5.IsSimple(arr[i][j])) {
                    count++;
                }
                b[i] = count;
            }
        }
    }

    public static void main(String[] args) {
        int M = 5;
        int N = 7;
        int A = -50;
        int B = 50;
        int[][] a = new int[N][M];
        int[] b = new int[N];

        InitA(a, M, N, A, B);
        PrintA(a, M, N);
        InitB(a, M, N, b);
        Lab5.PrintArr(b, N);
    }
}
