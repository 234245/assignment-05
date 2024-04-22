import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        int vowelCount = countVowels(word);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                count++;
            }
        }
        return count;
    }
}

