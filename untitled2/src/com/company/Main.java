package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src/mass.txt"));
        String text;
        int max = Integer.MIN_VALUE;
        while ((text = in.readLine()) != null) { // читаем файл построчно
            if (Integer.parseInt(text) > max) // ищем максимум
                max = Integer.parseInt(text);
        }
        System.out.println("Max: " + max);
        in.close();

    }
}
