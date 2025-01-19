package algorithm.begin;

/**
 * 给你两个整数 num1 和 num2，返回这两个整数的和。
 */
public class Sum {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int result = sum.sum(1, 5);
        System.out.println(result);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
