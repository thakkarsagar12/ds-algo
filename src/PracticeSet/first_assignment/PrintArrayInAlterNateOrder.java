package PracticeSet.first_assignment;

import java.util.Random;

public class PrintArrayInAlterNateOrder {
    static void printArrayInAlterNateOrder(int[] arr) {
        System.out.println("The given array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("The array in alternate order is: ");
        for (int i = 0; i < arr.length; i += 2 ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new Random().ints(10, 0, 100).toArray();
        printArrayInAlterNateOrder(arr);
    }
}
