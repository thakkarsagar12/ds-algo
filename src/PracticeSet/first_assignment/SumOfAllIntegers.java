package PracticeSet.first_assignment;

import java.util.Arrays;
import java.util.Random;

public class SumOfAllIntegers {

    static void sumOfGivenIntegers(int n, int[] arr) {
        System.out.println("The given array is: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + arr[i]; // sum += sum[i];
        }
        System.out.println("Sum of all integers from 1 to " + ++n + " is " + sum);
    }

    public static void main(String[] args) {
        int n = new Random().nextInt(10);
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new Random().nextInt(100);
        }
        sumOfGivenIntegers(n, arr);
    }
}
