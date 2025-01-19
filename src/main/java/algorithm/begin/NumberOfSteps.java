package algorithm.begin;

/**
 * 给你一个非负整数 num ，请你返回将它变成 0 所需要的步数。 如果当前数字是偶数，你需要把它除以 2 ；否则，减去 1 。
 */
public class NumberOfSteps {
    public static void main(String[] args) {
        NumberOfSteps numberOfSteps = new NumberOfSteps();
        System.out.println(numberOfSteps.numberOfSteps(14));
    }

    public int numberOfSteps(int num) {
        int steps = 0;
        while(num != 0) {
            if(num % 2 == 0) {
                num /= 2;
                steps++;
            }
            if(num % 2 != 0) {
                num -= 1;
                steps++;
            }
        }
        return steps;
    }
}
