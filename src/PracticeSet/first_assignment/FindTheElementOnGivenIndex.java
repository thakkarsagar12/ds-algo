package PracticeSet.first_assignment;

import java.util.Random;

public class FindTheElementOnGivenIndex {

    static void findTheElementOnGivenIndex(int size, int index) {
        int[] arr = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("The given array is: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The element on index " + index + " is " + arr[index]);
    }


    public static void main(String[] args) {


        findTheElementOnGivenIndex(new Random().nextInt(10), new Random().nextInt(10));
    }
}
