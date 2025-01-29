package FundamentalsModule.Arrays.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] dp = new int[array.length];
        int[] prevIndex = new int[array.length];

        dp[0] = 1;
        prevIndex[0] = -1;

        for (int i = 1; i < array.length; i++) {
            dp[i] = 1;
            prevIndex[i] = -1;

            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prevIndex[i] = j;
                }
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }


        int[] reverseSequence = new int[dp[maxIndex]];
        int currentIndex = maxIndex;
        int reverseIndex = dp[maxIndex] - 1;

        while (currentIndex >= 0) {
            reverseSequence[reverseIndex--] = array[currentIndex];
            currentIndex = prevIndex[currentIndex];
        }


        for (int num : reverseSequence) {
            System.out.print(num + " ");
        }
    }
}