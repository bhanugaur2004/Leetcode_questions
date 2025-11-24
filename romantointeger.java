public class romantointeger {
    public static int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;

        }
    }

    public static int romantointeger(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = value(s.charAt(i + 1));
                if (current < next) {
                    result = result - current;
                    continue;
                }
            }
            result = result + current;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(romantointeger("III"));
        System.out.println(romantointeger("IX"));
        System.out.println(romantointeger("LVIII"));
        System.out.println(romantointeger("MCMXCIV"));
    }
}
