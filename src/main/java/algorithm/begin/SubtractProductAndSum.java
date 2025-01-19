package algorithm.begin;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class SubtractProductAndSum {
    public static void main(String[] args) {
        SubtractProductAndSum subtractProductAndSum = new SubtractProductAndSum();
        int result = subtractProductAndSum.subtractProductAndSum(234);
        System.out.println(result);
    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }
}
