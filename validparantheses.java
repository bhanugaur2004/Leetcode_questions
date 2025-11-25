import java.util.Scanner;

public class validparantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the parantheses: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        System.out.print("\ntrue chota wala");
                    }
                }
            }
            if (s.charAt(i) == '[') {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == ']') {
                        System.out.print("\ntrue bada wala");
                    }
                }
            }
            if (s.charAt(i) == '{') {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '}') {
                        System.out.print("true tedha wala");
                    }
                }
            }
        }
        sc.close();
    }
}
