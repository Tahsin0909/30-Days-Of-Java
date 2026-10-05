// Collatz sequence: count the steps and track the highest value for every start from 1 to 30
public class CollatzSequence {

    public static class CollatzResult {
        int steps;
        int highestValue;

        CollatzResult(int steps, int highestValue) {
            this.steps = steps;
            this.highestValue = highestValue;
        }
    }

    public static CollatzResult collatzSequenceSteps(int x) {
        int temp = x;
        int steps = 0;
        int highestValue = x;
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp = temp / 2;
                highestValue = highestValue > temp ? highestValue : temp;
                steps++;
            } else {
                temp = 3 * temp + 1;
                highestValue = highestValue > temp ? highestValue : temp;
                steps++;
            }
        }
        return new CollatzResult(steps, highestValue);
    }

    public static void main(String[] args) {
        int input = 6;
        CollatzResult result = collatzSequenceSteps(input);
        System.out.println("Steps need to resch 1 from " + input + " is " + result.steps + " and highest value is "
                + result.highestValue);
    }
}
