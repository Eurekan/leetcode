package algorithm.array.minSubArrayLen;

/**
 * 209.长度最小的子数组
 */
public class MinSubArrayLen {

    /**
     * 滑动窗口
     * 时间复杂度：O(n)，其中 n 是数组的长度。指针 start 和 end 最多各移动 n 次。
     * 空间复杂度：O(1)。
     * @param target
     * @param nums
     * @return
     */
    public int minSubArrayLen(int target, int[] nums) {
        // 滑动窗口起始位置
        int left = 0;
        // 滑动窗口数值之和
        int sum = 0;
        // 初始化结果值
        int result = Integer.MAX_VALUE;

        // 通过右指针遍历数组
        for (int right = 0; right < nums.length; right++) {
            // 累加遍历元素
            sum += nums[right];
            // 判断累加值是否大于等于目标值
            while (sum >= target) {
                // 如果等于，取当前结果值与左右指针区间内的元素的个数的最小值
                result = Math.min(result, right - left + 1);
                // 将当前累加值减去当前遍历元素，并且指针向后移动
                sum -= nums[left++];
            }
        }
        // 返回要达成目标值的最小个数
        // 比较结果值与初始化时赋值是否相等，相等说明没找到最小值，返回题目要求返回的零；如果不相等则返回结果值
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
