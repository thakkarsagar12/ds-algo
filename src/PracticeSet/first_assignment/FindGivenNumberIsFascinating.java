package PracticeSet.first_assignment;

import java.util.Random;

public class FindGivenNumberIsFascinating {
    static void findGivenNumberIsFascinating(int n) {
        int n2 = n * 2;
        int n3 = n * 3;
        String s = n + "" + n2 + "" + n3;
        boolean isFascinating = true;
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == i + '0') {
                    count++;
                }
            }
            if (count != 1) {
                isFascinating = false;
                break;
            }
        }
        if (isFascinating) {
            System.out.println("The given number is a fascinating number.");
        } else {
            System.out.println("The given number is not a fascinating number.");
        }

    }

    public static void main(String[] args) {
        findGivenNumberIsFascinating(192);
        findGivenNumberIsFascinating(new Random().nextInt(10000));
    }
}
