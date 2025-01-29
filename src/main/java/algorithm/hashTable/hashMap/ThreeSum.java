package algorithm.hashTable.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15.三数之和
 */
public class ThreeSum {
    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // 初始化结果列表
        ArrayList<List<Integer>> res = new ArrayList<>();
        // 数组排序
        Arrays.sort(nums);
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 如果数组第一个数已经大于零，那么数组无论如何也无法凑成三元组，直接返回结果
            if (nums[i] > 0) return res;
            // 如果数组不是第一个数，并且后一个数和前一个数相等，跳过本次循环进行下次循环（去重a）
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            // 初始化左指针
            int left = i + 1;
            // 初始化右指针
            int right = nums.length - 1;
            // 通过左指针和右指针循环遍历数组，循环条件为右指针大于左指针（右指针无法等于左指针，因为右指针等于左指针时b和c指向同一个数字）
            while (right > left) {
                // 计算出三数之和
                int sum = nums[i] + nums[left] + nums[right];
                // 如果结果大于零
                if (sum > 0) {
                    // 使右指针（指向最大数）向前移动一位
                    right--;
                } else if (sum < 0) { // 如果结果小于零
                    // 使左指针（指向最小数）向后移动一位
                    left++;
                } else { // 如果三数之和等都零
                    // 将三个数作为一个arraylist存入结果列表
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 循环判断右指针大于左指针（左右指针合法）
                    // 判断右指针是否与前一位数字相等（去重c）
                    // 如果相等则让右指针向前一位
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    // 循环判断右指针大于左指针（左右指针合法）
                    // 判断左指针是否与后一位数字相等（去重b）
                    // 如果相等则让左指针向后一位
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    // 右指针向前移动一位
                    right--;
                    // 左指针向后移动一位
                    left++;
                }
            }
        }
        // 返回结果列表
        return res;
    }
}
