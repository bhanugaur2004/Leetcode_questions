import java.util.Scanner;;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        int original = x;
        int reverse = 0;
        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        System.out.println("Revresed: " + reverse);
        if (original == reverse) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
        sc.close();
    }
}
