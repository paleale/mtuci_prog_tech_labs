package ru.mtuci.progtech;

// Лабораторная работа No 3. Числовые и функциональные ряды
// Уровень А.
// 17. an = 10 / (n^2 + 5n +1)

public class Lab3 {
    static int n, i;
    static double sum=0;

    static double Sum(int n) {
        for(i = 1; i <= n; i++){
            sum += 10.0 / (i*i + 5*i + 1);
        }
        return sum;
    }


    public static void main(String[] args){
        System.out.println("Enter n: ");
        n = Utilities.readInt();
        System.out.printf("sum = %.10f\n", Sum(n));
    }
}
