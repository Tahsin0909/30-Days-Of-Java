// Compress a string(aaabb becomes a3b2)and write the decompress method too

public class CompressString {

    public static String compreessString(String str) {
        String trimInput = str.trim();
        String result = "";
        int count = 0;
        for (int i = 0; i < trimInput.length(); i++) {
            char temp = trimInput.charAt(i);
            char next = trimInput.charAt(i);
            if (i + 1 < trimInput.length()) {
                System.out.println(next);
                next = trimInput.charAt(i + 1);
            }
            if (temp == next) {
                count++;
            } else {
                result = result + temp + count;
                count = 0;
            }
        }
        result = result + trimInput.charAt(trimInput.length() - 1) + count;
        return result;
    }

    public static void main(String[] args) {
        String input = " aaabbcccc";
        System.out.println("Final Output: " + compreessString(input));
    }
}
