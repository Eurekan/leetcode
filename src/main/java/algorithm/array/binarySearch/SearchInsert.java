package algorithm.array.binarySearch;

/**
 * 35.搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class SearchInsert {
    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int result = searchInsert.searchInsert(new int[]{1, 3, 5, 6, 10, 14, 19, 26}, 2);
        System.out.println(result);

    }

    /**
     * 线性查找
     * 时间复杂度O(N) N为数组的长度
     * 空间复杂度O(1) 只使用了常数个额外的变量（如index），并没有使用与输入规模相关的额外数据结构，所以它的空间复杂度是O(1)
     * @param nums 升序数组
     * @param target 目标值
     * @return 下标
     */
    /*public int searchInsert(int[] nums, int target) {
        int index;
        for (index = 0; index < nums.length; index++) {
            if (nums[index] >= target) {
                return index;
            }
        }
        return index;
    }*/

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }
}
