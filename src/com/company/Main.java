package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {9, 45, 8.6, 1.3, 2, 54, -17, -2.1, -10, -25, -7, 14, 5, 3.3, 2};
        System.out.println(Arrays.toString(array));
        double result = 0;
        int positiveNumbers = 0;
        boolean itPositive = false;


        for (double c : array) {
            if (c < 0) {
                itPositive = true;

            } else {
                if (itPositive) {
                    result += c;
                    positiveNumbers++;
                }


            }


        }
        System.out.println("среднее арифметическое число " + result / positiveNumbers);
    }















}