package se.iths.katharina.gitexerciseovning2;

public class Main {
    static void main() {

        IO.println(maxA(4, 9));

    }

    public static int maxA(int number1, int number2) {
        int maxedNumber = Math.max(number1, number2);
        return maxedNumber;
    }

}
