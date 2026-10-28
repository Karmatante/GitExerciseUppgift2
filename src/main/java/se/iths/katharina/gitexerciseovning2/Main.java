package se.iths.katharina.gitexerciseovning2;

import java.awt.image.ImagingOpException;

public class Main {
    static void main() {

        IO.println(maxA(4, 9));
        IO.println(roundA(45.4523));
        IO.println(parseIntA("42") + 8);

    }

    public static int maxA(int number1, int number2) {
        int maxedNumber = Math.max(number1, number2);
        return maxedNumber;
        IO.println(maxB(4,9));
    }
    public static int maxB(int a, int b) {
        return Math.max(a,b);
    }

    public static double roundA(double number) {
        long roundedNumber = Math.round(number);
        return roundedNumber;
    }

    public static int parseIntA(String textNumber) {
        int number = Integer.parseInt(textNumber);
        return number;

    }
}
