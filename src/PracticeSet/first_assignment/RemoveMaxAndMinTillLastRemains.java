package PracticeSet.first_assignment;

import java.util.Random;

public class RemoveMaxAndMinTillLastRemains {
    static void removeMaxAndMinTillLastRemains(int[] arr) {
        System.out.println("The given array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        int[] minAndMax = findMinAndMaxIndex(arr);

        if (arr.length >= 3) {
            arr = removeElement(arr, arr[minAndMax[0]]);
            arr = removeElement(arr, arr[minAndMax[1]]);
            removeMaxAndMinTillLastRemains(arr);
        }
        else if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                System.out.println("The last element remaining is: " + arr[0]);
            } else {
                System.out.println("The last element remaining is: " + arr[1]);
            }
        }
        else {
            for (int j : arr) {
                System.out.println(j);
            }
            System.out.println("The last element remaining is: " + arr[0]);
        }
    }

    static int findMaxIndex(int[] arr){
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static int findMinIndex(int[] arr){
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int[] findMinAndMaxIndex(int[] arr){
        int min = arr[0];
        int minIndex = 0;
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    static int[] removeElement(int[] arr, int index){
        int[] arr2 = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            if (i < index) {
                arr2[i] = arr[i];
            } else {
                arr2[i] = arr[i+1];
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        removeMaxAndMinTillLastRemains(new Random().ints(10, 0, 100).toArray());
    }
}
