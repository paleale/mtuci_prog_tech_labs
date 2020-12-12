package ru.mtuci.progtech;

// Лабораторная работа No 4. Вычисление характеристик числовых последовательностей
// Уровень А.
// 17. Есть ли цифра 5 в элементах последовательности

public class Lab4 {
    static int digit=5;
    static int number;
    static int count=0;

    static boolean HasDigit(int number, int digit){
        while(number > 0)
        {
            if(number % 10 == digit)
                return true;
            number = number / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers sequence separated by Enter, finish with 0: ");
        while ((number = Utilities.readInt()) != 0) {
            if (HasDigit(number, digit)){
                count++;
            }
        }
        System.out.printf("Count: %d\n", count);
    }
}
