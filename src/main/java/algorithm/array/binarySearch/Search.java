package algorithm.array.binarySearch;

/**
 * 704.二分查找
 */
public class Search {
    public static void main(String[] args) {
        Search search = new Search();
        int result = search.search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 8);
        int result2 = search.search2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 8);
        System.out.println(result);
        System.out.println(result2);
    }

    /**
     * 二分法的第一种写法（左闭右闭）
     * 时间复杂度：O(log n)
     * 空间复杂度：O(1)
     * @param nums 有序数组（升序）
     * @param target 目标数
     * @return 如找到返回目标数，如果为找到返回-1
     */
    public int search(int[] nums, int target) {
        // 避免当target小于nums[0]或大于nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 二分法的第二种写法（左闭右开）
     * 时间复杂度：O(log n)
     * 空间复杂度：O(1)
     * @param nums 有序数组（升序）
     * @param target 目标数
     * @return 如找到返回目标数，如果为找到返回-1
     */
    public int search2(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + ((right - left) >> 2);
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return -1;
    }
}
