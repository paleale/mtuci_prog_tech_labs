package ru.mtuci.progtech;

// Лабораторная работа No 2. Проверка попадания точки в область на плоскости
// Уровень А.
// A17. (-6, -10), (-6, 3), (4, 3), (4, -10)

public class Lab2 {
    static double x, y, h;
    static int n;
    static int count=0;
    // Вершины:
    static int P1=-6;
    static int P2=4;
    static int P3=-10;
    static int P4=3;


    public static void main(String[] args) {
        System.out.println("Enter n: ");
        n = Utilities.readInt();
        h=(Lab1.B - Lab1.A) / (n - 1);
        for(x = Lab1.A; x <= Lab1.B; x += h) {
            y=Lab1.F(x);
            System.out.printf("%10.4f %10.4f\n", x, y);
            if (x >= P1 && x <= P2 && y >= P3 && y <= P4) {
                count++;
            }
        }
        System.out.printf("count = %d\n", count);
    }
}
