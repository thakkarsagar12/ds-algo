package PracticeSet.first_assignment;

import java.util.Random;

public class SumOfGivenSeries {
    static void sumOfGivenSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of given series is " + sum);
    }

    public static void main(String[] args) {
        sumOfGivenSeries(new Random().nextInt(10));
    }
}
