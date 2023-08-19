package PracticeSet.first_assignment;

public class ShortedArrayFindNumberOFElementsWhichAreLessThenEqualToGiven {

    static void shortedArrayFindNumberOFElementsWhichAreLessThenEqualToGiven(int[] arr, int x) {
        int count = 0;
        for (int j : arr) {
            if (j <= x) {
                count++;
            }
        }
        System.out.println("The number of elements which are less then or equal to " + x + " is " + count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 10, 12, 15, 18, 20};
        int x = 6;
        shortedArrayFindNumberOFElementsWhichAreLessThenEqualToGiven(arr, x);
    }
}
