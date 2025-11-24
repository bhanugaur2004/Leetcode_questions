import java.util.Scanner;

public class lastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        int i = sentence.length() - 1, length = 0;
        while (i >= 0 && sentence.charAt(i) == ' ')
            i--;
        while (i >= 0 && sentence.charAt(i) != ' ') {
            length++;
            i--;
        }
        System.out.println(length);
        sc.close();
    }
}
