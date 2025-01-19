package algorithm.array.binarySearch;

import java.util.Arrays;

/**
 * 34.在排序数组中查找元素的第一个和最后一个位置
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 */
public class SearchRange {
    public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        int[] result = searchRange.searchRange(new int[]{1, 3, 3, 5, 6}, 3);
        System.out.println(Arrays.toString(result));
    }

    public int[] searchRange(int[] nums, int target) {
        int start = findStartIndex(nums, target);
        int end = findEndIndex(nums, target);
        if (start == -1) {
            return new int[]{-1, -1}; // 如果开始位置是-1，那么结束位置也必然是-1
        }
        return new int[]{start, end};
    }

    private int findStartIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1; // 目标在mid右侧
            } else if (nums[mid] > target) {
                end = mid - 1; // 目标在mid左侧
            } else { // nums[mid] == target
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid; // 找到了最左边的目标值
                } else {
                    end = mid - 1; // 继续向左侧查找
                }
            }
        }
        return -1; // 没有找到目标值
    }

    private int findEndIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1; // 目标在mid右侧
            } else if (nums[mid] > target) {
                end = mid - 1; // 目标在mid左侧
            } else { // nums[mid] == target
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid; // 找到了最右边的目标值
                } else {
                    start = mid + 1; // 继续向右侧查找
                }
            }
        }
        return -1; // 没有找到目标值
    }
}
