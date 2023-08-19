package PracticeSet.first_assignment;

import java.util.Random;

public class ValueOfElementIsEqualToGivenIndex {

    static void valueOfElementIsEqualToGivenIndex(int[] arr) {
        System.out.println("The given array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("The elements whose value is equal to their index are: ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == i) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            valueOfElementIsEqualToGivenIndex(new Random().ints(10, 0, 10).toArray());
        }
    }
}
