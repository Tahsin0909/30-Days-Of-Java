// Compress a string(aaabb becomes a3b2)and write the decompress method too

public class CompressString {

    public static StringBuilder compreessString(String str) {
        String trimInput = str.trim();
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 1; i < trimInput.length(); i++) {
            char temp = trimInput.charAt(i);
            char next = trimInput.charAt(i + 1);
            System.out.println(temp);
            // System.out.println(next);
            if (temp == next) {
                count++;
            } else {
                count++;
                result.append(temp);
                result.append(count);
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = " aaab";
        System.out.println("Final Output: " + compreessString(input));
    }
}

