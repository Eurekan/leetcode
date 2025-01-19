package algorithm.begin;

/**
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 */
public class Shuffle {
    public static void main(String[] args) {
        Shuffle shuffle = new Shuffle();
        int[] results = shuffle.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n]; // 创建一个长度为 2n 的新数组

        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];           // 添加 xi
            result[2 * i + 1] = nums[i + n];   // 添加 yi
        }

        return result;
    }
}
