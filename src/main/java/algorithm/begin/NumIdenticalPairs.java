package algorithm.begin;

/**
 * 给你一个整数数组 nums 。
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 * 返回好数对的数目。
 */
public class NumIdenticalPairs {
    public static void main(String[] args) {
        NumIdenticalPairs numIdenticalPairs = new NumIdenticalPairs();
        int result = numIdenticalPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(result);
    }

    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;

        // 使用双重循环遍历所有可能的 (i, j) 对
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 如果找到一对满足条件的数字，则计数器加一
                if (nums[i] == nums[j]) {
                    goodPairs++;
                }
            }
        }

        return goodPairs;
    }
}
