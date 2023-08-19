package PracticeSet.first_assignment;

public class FindPerfectArray {
    static void findPerfectArray(int[] arr) {
        // reverse of given array should be same as given array
        System.out.println("The given array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }
        System.out.println("The reverse of given array is: ");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println();
        boolean isPerfectArray = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                isPerfectArray = false;
                break;
            }
        }
        if (isPerfectArray) {
            System.out.println("The given array is a perfect array.");
        } else {
            System.out.println("The given array is not a perfect array.");
        }
    }

    public static void main(String[] args) {
        findPerfectArray(new int[]{1, 2, 3, 4, 5});
        findPerfectArray(new int[]{1, 2, 3, 2, 1});
    }
}
