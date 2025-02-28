package algorithm.begin;

/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {
        IsPowerOfTwo isPowerOfTwo = new IsPowerOfTwo();
        System.out.println(isPowerOfTwo.isPowerOfTwo(16));
    }

    public boolean isPowerOfTwo(int n) {
        boolean result = false;
        for (int i = 0; i < 32; i++) {
            if (n == Math.pow(2, i)) {
                return result = true;
            }
        }
        return result;
    }
}
