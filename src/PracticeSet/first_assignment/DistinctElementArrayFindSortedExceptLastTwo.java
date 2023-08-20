package PracticeSet.first_assignment;



public class DistinctElementArrayFindSortedExceptLastTwo {

    static void merge(int[] arr, int l, int m , int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            arr2[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
           if (arr1[i] <= arr2[j]) {
               arr[k] = arr1[i];
               i++;
           } else {
               arr[k] = arr2[j];
               j++;
           }
           k++;
        }
        while (i < n1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    static int[] sortArray(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sortArray(arr, l, m);
            sortArray(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }

    static int[] removeLastTwoElementFromArray(int[] arr) {
        int[] arr2 = new int[arr.length - 2];
        System.arraycopy(arr, 0, arr2, 0, arr.length - 2);
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 6, 7, 8};
        System.out.println("The given array is: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("The sorted array except last two elements is: ");
        int[] arr2 = removeLastTwoElementFromArray(sortArray(arr, 0, arr.length - 1));
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
