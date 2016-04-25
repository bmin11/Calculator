package com.example.bmin.calculator;

/**
 * Created by bmin on 2015-09-29.
 */
public class Math2 {
    public static double add(String first, String second) {
        return Double.parseDouble(first) + Double.parseDouble(second);
    }

    public static double subtract(String first, String second) {
        return Double.parseDouble(first) - Double.parseDouble(second);
    }

    public static double multiply(String first, String second) {
        return Double.parseDouble(first) * Double.parseDouble(second);
    }

    public static double divide(String first, String second) {
        return Double.parseDouble(first) / Double.parseDouble(second);
    }

    public static String changeSign(String numString) {
        double num = Double.parseDouble(numString);
        String returnNum;
        if (num > 0)
            returnNum = "-" + numString;
        else
            returnNum = String.valueOf(Math.abs(num));
        return returnNum;
    }
}
