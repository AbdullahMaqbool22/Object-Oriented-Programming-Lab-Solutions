import java.util.Scanner;
public class Task7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] topics = {
            "Political Issues",
            "Global Environmental Issues",
            "Social Justice",
            "Healthcare",
            "Education"
        };
        int[][] responses = new int[5][10];
        for (int j = 0; j < 10; j++) {
            System.out.println("Rate the following issues from 1 (least important) to 10 (most important):");
            for (int i = 0; i < 5; i++) {
                System.out.print(topics[i] + ": ");
                responses[i][j] = input.nextInt();
            }
        }
        System.out.println("\nAverage Ratings for Each Issue:");
        for (int i = 0; i < 5; i++) {
            double average = calculateAverage(responses[i]);
            System.out.println(topics[i] + ": " + average);
        }
        int highestTotal = -1;
        int lowestTotal = Integer.MAX_VALUE;
        String highestIssue = "";
        String lowestIssue = "";

        for (int i = 0; i < 5; i++) {
            int total = calculateTotal(responses[i]);
            if (total > highestTotal) {
                highestTotal = total;
                highestIssue = topics[i];
            }
            if (total < lowestTotal) {
                lowestTotal = total;
                lowestIssue = topics[i];
            }
        }
        System.out.println("\nIssue with the Highest Point Total:");
        System.out.println(highestIssue + ": " + highestTotal);

        System.out.println("\nIssue with the Lowest Point Total:");
        System.out.println(lowestIssue + ": " + lowestTotal);

        input.close();
    }
    public static double calculateAverage(int[] ratings) {
        int sum = 0;
        for (int i = 0; i < ratings.length; i++) {
            sum += ratings[i];
        }
        return (double) sum / ratings.length;
    }
    public static int calculateTotal(int[] ratings) {
        int total = 0;
        for (int i = 0; i < ratings.length; i++) {
            total += ratings[i];
        }
        return total;
    }
}
