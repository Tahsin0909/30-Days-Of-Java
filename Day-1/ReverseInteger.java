// Reverse an integer and return 0 if it overflows, without using long
public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        System.out.println("-----------------------");

        while (x != 0) {
            int lastDigit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10) {
                return 0;
            }
            System.out.println("Before assign " + reversed);
            System.out.println("lastDigit " + lastDigit);
            reversed = reversed * 10 + lastDigit;
            System.out.println("After assign " + reversed);
            System.out.println("-----------------------");

            x = x / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int targetInt = 153423649;
        System.out.println("Target: " + targetInt);
        System.out.println("Final: " + reverse(targetInt));
    }
}
// Time: O(log x)
// Space: O(1)

// with long
// public class ReverseInteger {
// public static long reverse(int x) {
// long reversed = 0;

// while (x != 0) {
// long lastDigit = x % 10;
// System.out.println(lastDigit);
// reversed = reversed * 10 + lastDigit;
// x = x / 10;
// }
// return reversed;
// }

// public static void main(String[] args) {
// System.out.println(reverse(1534236469));
// }
// }