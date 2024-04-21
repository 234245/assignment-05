import java.util.Scanner;

public class IntegerSequenceAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a: Find smallest and largest inputs
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // Part b: Count even and odd inputs
        int evenCount = 0;
        int oddCount = 0;

        // Part c: Cumulative totals
        int cumulativeTotal = 0;

        // Part d: Adjacent duplicates
        int prev = Integer.MIN_VALUE;

        System.out.println("Enter integers (type 'done' to finish): ");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();

            // Part a: Find smallest and largest inputs
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }

            // Part b: Count even and odd inputs
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Part c: Cumulative totals
            cumulativeTotal += num;
            System.out.print(cumulativeTotal + " ");

            // Part d: Adjacent duplicates
            if (num == prev) {
                System.out.print(num + " ");
            }
            prev = num;
        }

        System.out.println("\nSmallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scanner.close();
    }
}

