import java.util.Stack;
import java.util.Scanner;

public class validparantheses2 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // If opening bracket → push into stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // If closing bracket → stack must not be empty
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                // Check matching pair
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Stack must be empty if all brackets match
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parantheses: ");
        String s = sc.nextLine();
        sc.close();
        System.out.println(isValid(s));
    }
}
