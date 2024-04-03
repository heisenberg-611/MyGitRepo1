import java.util.Scanner;

public class LAB_7_HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        String alternatingCapsSentence = getAlternatingCaps(input);
        System.out.println("Modified sentence: " + alternatingCapsSentence);
    }

    public static String getAlternatingCaps(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
                capitalizeNext = !capitalizeNext;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
