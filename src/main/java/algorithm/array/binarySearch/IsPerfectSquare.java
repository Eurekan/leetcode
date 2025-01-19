package algorithm.array.binarySearch;

/**
 * 367.有效的完全平方数
 * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。
 * 不能使用任何内置的库函数，如  sqrt 。
 * 示例 1：
 * 输入：num = 16
 * 输出：true
 * 解释：返回 true ，因为 4 * 4 = 16 且 4 是一个整数。
 * 示例 2：
 * 输入：num = 14
 * 输出：false
 * 解释：返回 false ，因为 3.742 * 3.742 = 14 但 3.742 不是一个整数。
 * 提示：
 * 1 <= num <= 231 - 1
 */
public class IsPerfectSquare {
    public static void main(String[] args) {
        IsPerfectSquare isPerfectSquare = new IsPerfectSquare();
        boolean result = isPerfectSquare.isPerfectSquare(5);
        System.out.println(result);
    }

    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // 0 和 1 都是完全平方数

        long left = 1;
        long right = num / 2; // 因为 (num/2)^2 总是 >= num 对于 num > 1

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
