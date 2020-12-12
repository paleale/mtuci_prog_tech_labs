package ru.mtuci.progtech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Utilities {
    static int number;

    // reads input, and if it is an integer, returns it, else throws an exception
    public static int readInt() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(br.readLine());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return number;
    }
}
