// public class firstoccurence {
//     public static void main(String[] args) {
//         String haystack = "sadbutsad";
//         // String needle = "sad";
//         // int a = 0;
//         for (int i = 0; i < haystack.length(); i++) {
//             if (haystack.charAt(i) == 's') {
//                 System.out.println(i);
//                 if (haystack.charAt(i + 1) == 'a') {
//                     if (haystack.charAt(i + 2) == 'd') {
//                         System.out.println("Mil gaya");
//                     }
//                 }

//             }
//         }
//     }
// }

public class firstoccurence {
    public static void main(String[] args) {
        String haystack = "dadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Edge case — empty needle
        if (m == 0)
            return 0;

        // Loop only till haystack.length - needle.length
        for (int i = 0; i <= n - m; i++) {
            // Check substring match
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m)
                return i; // full match
        }

        return -1; // no match
    }
}
