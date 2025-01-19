package algorithm.array.sortedSquares;

import java.util.Arrays;

/**
 * 977.有序数组的平方
 */
public class SortedSquares {

    /**
     * 排序法
     * 时间复杂度：O(n+log n)
     * @param nums
     * @return
     */
    /*public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }*/

    /**
     * 双指针法
     * 时间复杂度：O(n)
     * @param nums
     * @return
     */
    public int[] sortedSquares(int[] nums) {
        // 初始化结果数组
        int[] result = new int[nums.length];
        // 初始化左指针为数组头，右指针为数组尾
        int left = 0, right = nums.length - 1;
        // 初始化结果数组的尾为下标
        int index = nums.length - 1;

        while (left <= right) {
            // 如果左指针的绝对值大于右指针的绝对值
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                // 将左指针指向元素平方放入结果数组
                result[index] = nums[left] * nums[left];
                // 左指针向后移动
                left++;

            } else { // 如果左指针的绝对值小于等于右指针的绝对值
                // 将右指针指向元素平方放入结果数组
                result[index] = nums[right] * nums[right];
                // 右指针向前移动
                right--;
            }
            // 每比较放入一个元素到结果数组中使结果数组的下标向前移动
            index--;
        }
        // 返回结果数组
        return result;
    }
}
