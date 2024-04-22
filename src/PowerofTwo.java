public class PowerofTwo {
    public static void main(String[] args) {
        int start = 20;
        int end = 20;

        for (int i = start; i <= end; i++) {
            long power = (long) Math.pow(2, i);
            System.out.println("2^" + i + " = " + power);
        }
    }
}

