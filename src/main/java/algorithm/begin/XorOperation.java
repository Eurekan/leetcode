package algorithm.begin;

/**
 * 给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 */
public class XorOperation {
    public static void main(String[] args) {
        XorOperation xorOperation = new XorOperation();
        int result = xorOperation.xorOperation(5, 0);
        System.out.println(result);
    }

    public int xorOperation(int n, int start) {
        int result = 0;
        for(int i = 0; i < n; i++){
            int element = start + 2 * i;
            result ^= element;
        }
        return result;
    }
}
