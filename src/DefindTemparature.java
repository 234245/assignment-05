import java.util.Scanner;

public class DefindTemparature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store temperature values for twelve months
        double[] temperatures = new double[12];

        // Reading temperature values for twelve months
        for (int i = 0; i < 12; i++) {
            System.out.print("Enter temperature for month " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        // Finding the month with the highest temperature
        int highestMonth = 0;
        double highestTemperature = temperatures[0];
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemperature) {
                highestMonth = i;
                highestTemperature = temperatures[i];
            }
        }

        // Printing the month with the highest temperature
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("Month with the highest temperature: " + months[highestMonth]);
    }
}

