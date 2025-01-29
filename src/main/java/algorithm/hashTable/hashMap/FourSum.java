package algorithm.hashTable.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18.四数之和
 */
public class FourSum {
    /**
     * 时间复杂度: O(n^3)
     * 空间复杂度: O(1)
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); // 排序数组
        List<List<Integer>> res = new ArrayList<>(); // 结果列表
        for (int k = 0; k < nums.length; k++) {
            // 剪枝处理
            if (nums[k] > target && nums[k] > 0) break;
            // nums[k]去重
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            for (int i = k + 1; i < nums.length; i++) {
                // 二级剪枝
                if (nums[k] + nums[i] > target && nums[k] + nums[i] > 0) break;
                // nums[i]去重
                if (i > k + 1 && nums[i] == nums[i - 1]) continue;
                int left = i + 1;
                int right = nums.length -1;
                while (right > left) {
                    int sum = nums[k] + nums[i] + nums[left] + nums[right];
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
                        res.add(Arrays.asList(nums[k], nums[i], nums[left], nums[right]));
                        // nums[left]和nums[right]去重
                        while (right > left && nums[right] == nums[right - 1]) right--;
                        while (right > left && nums[left] == nums[left + 1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return res;
    }
}
