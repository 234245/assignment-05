import java.util.Scanner;

public class BinaryDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printBinaryDigits(number);
    }

    public static void printBinaryDigits(int number) {
        if (number == 0) {
            System.out.println(0);
            return;
        }

        while (number != 0) {
            int remainder = number % 2;
            System.out.println(remainder);
            number /= 2;
        }
    }
}
