package ru.mtuci.progtech;

public class Lab3 {
    static int n, i;
    static double sum=0;

    static double Sum(int n) {
        // 17. an = 10 / (n^2 + 5n +1)
        for(i = 1; i <= n; i++){
            sum += 10.0 / (i*i + 5*i + 1);
        }
        return sum;
    }

    // Уровень А.
    public static void main(String[] args){
        System.out.println("Enter n: ");
        n = Utilities.readInt();
        System.out.printf("sum = %.10f\n", Sum(n));
    }
}
