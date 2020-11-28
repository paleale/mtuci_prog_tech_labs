package ru.mtuci.progtech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static void main(String[] args){
        // Bon appetit
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n: ");
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.printf("sum = %.10f\n", Sum(n));
    }
}
