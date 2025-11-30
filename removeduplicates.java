// import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 8 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("There is an duplicate.");
                    break;
                }
            }
        }
        // System.out.println("Woho!!!!");
        // sc.close();
    }
}
