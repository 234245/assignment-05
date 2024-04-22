import java.util.Scanner;

class DataSet {
    private double sum;
    private double smallest;
    private double largest;
    private int count;

    public DataSet() {
        sum = 0;
        count = 0;
        smallest = Double.POSITIVE_INFINITY;
        largest = Double.NEGATIVE_INFINITY;
    }

    public void add(double value) {
        sum += value;
        count++;
        if (value < smallest) {
            smallest = value;
        }
        if (value > largest) {
            largest = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return sum / count;
    }

    public double getSmallest() {
        if (count == 0) {
            return 0; // Alternatively, you can throw an exception here
        }
        return smallest;
    }

    public double getLargest() {
        if (count == 0) {
            return 0; // Alternatively, you can throw an exception here
        }
        return largest;
    }

    public double getRange() {
        return largest - smallest;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataSet dataSet = new DataSet();

        System.out.print("Enter floating-point values separated by spaces: ");
        String input = scanner.nextLine();
        String[] values = input.split("\\s+");

        for (String value : values) {
            try {
                double num = Double.parseDouble(value);
                dataSet.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + value);
            }
        }

        System.out.println("Average: " + dataSet.getAverage());
        System.out.println("Smallest: " + dataSet.getSmallest());
        System.out.println("Largest: " + dataSet.getLargest());
        System.out.println("Range: " + dataSet.getRange());
    }
}
