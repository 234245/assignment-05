
import .java.util.Scanner;
public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers between 2 and 100: " + sum);
    }
}
public class SquareSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares between 1 and 100: " + sum);
    }
}
public class PowersOfTwo {
    public static void main(String[] args) {
        for (int i = 20; i <= 220; i++) {
            System.out.println("2^" + i + " = " + Math.pow(2, i));
        }
    }
}


public class OddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers between " + a + " and " + b + ": " + sum);
        scanner.close();
    }
}

public class OddDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("Sum of odd digits: " + sum);
        scanner.close();
    }
}
