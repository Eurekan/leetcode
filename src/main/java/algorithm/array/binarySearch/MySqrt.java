package algorithm.array.binarySearch;

/**
 * 69.x的平方根
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 */
public class MySqrt {
    public static void main(String[] args) {
        MySqrt mySqrt = new MySqrt();
        int result = mySqrt.mySqrt(4);
        System.out.println(result);
    }

    public int mySqrt(int x) {
        // 如果x为0或1返回x
        if (x == 0 || x == 1) {
            return x;
        }
        // 初始化开始结束下标和结果
        int start = 1, end = x / 2, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2; // 防止溢出
            // 检查 mid 是否是平方根
            if (mid <= x / mid) { // 防止溢出
                start = mid + 1;
                ans = mid; // 更新答案
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
