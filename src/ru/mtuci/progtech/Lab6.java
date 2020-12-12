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

    static int[] Sort(int[] a, int n) {
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

    static int Reverse(int num) {
        int num1 = 0;
        while (num > 0)
        {
            int digit = num % 10;
            num /= 10;
            num1 = num1 * 10;
            num1 += digit;
        }
        return num1;
    }

    public static void main(String[] args) {
        // размер массива
        int N = 20;
        int[] a;
        a = new int[N];
        int[] aaa;
        aaa = new int[N];
        int z;
        int da = B;
        int Qdivisor = 3;
        int Tdigit = 5;

        Lab5.InitArr(a, N, A, B);
        Lab5.PrintArr(a, N);

        for (z = 0; z < N; z++){
            if (DivsBy(a[z], Qdivisor)) {
                if (a[z] < da) {
                    da = a[z];
                }
            }
        }
        System.out.printf("\nНаименьший элемент, делимый на %d это: %d\n", Qdivisor, da);

        System.out.println("Массив с отреверсированными числами содержащими 5:");
        for (z = 0; z < N; z++){
            if (Lab4.HasDigit(a[z], Tdigit)) {
                aaa[z] = Reverse(a[z]);
            } else {
                aaa[z] = a[z];
            }
        }
        Lab5.PrintArr(aaa, N);

        System.out.println("\nМассив, отсортированный по возрастанию:");
        Lab5.PrintArr(Sort(aaa, N), N);
    }
}
