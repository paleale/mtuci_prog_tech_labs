package ru.mtuci.progtech;

// Лабораторная работа No 6. Модификация одномерных массивов
// Уровень В.
// B17.
// Найти минимальный элемент массива из всех элементов, которые являются степенью тройки.
// Заменить все числа, которые не содержат в своем составе цифру 5 на их обратные
// изображения (например, 123 заменить на 321).
// Отсортировать массив по возрастанию.

public class Lab6 {
    static int A=10;
    static int B=99;

    // делится ли число на другое число без остатка?
    static boolean DivsBy(int a, int divisor){
        return a % divisor == 0;
    }

    static int[] Sort(int[] a, int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = (n - 1); j > i; j--)
            {
                if (a[j - 1] > a[j])
                {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        // size of an array
        int N = 20;
        int[] a;
        a = new int[N];
        int z = a[0];
        int da = B;
        int divisor = 3;

        Lab5.InitArr(a, N, A, B);
        Lab5.PrintArr(a, N);

        for (z = 0; z < N; z++){
            if (DivsBy(a[z], divisor)) {
                if (a[z] < da) {
                    da = a[z];
                }
            }
        }
        System.out.printf("\nНаименьший элемент, делимый на %d это: %d\n", divisor, da);
        System.out.println("Массив, отсортированный по возрастанию:");
        Lab5.PrintArr(Sort(a, N), N);
    }
}
