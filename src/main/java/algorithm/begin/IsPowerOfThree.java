package algorithm.begin;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 */
public class IsPowerOfThree {
    public static void main(String[] args) {
        boolean result = new IsPowerOfThree().isPowerOfThree(9);
        System.out.println(result);
    }

    public boolean isPowerOfThree(int n) {
        boolean result = false;
        for (int i = 0; i < 32; i++) {
            if (n == Math.pow(3, i)) {
                return result = true;
            }
        }
        return result;
    }
}
