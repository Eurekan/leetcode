package algorithm.array.removeElement;

/**
 * 283.移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 * 提示:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // 定义快慢指针
        int slow = 0;
        // 通过快指针遍历数组，寻找不包含零的新数组
        for (int fast = 0; fast < nums.length; fast++) {
            // 判断遍历的快指针指向的元素是否为零
            if (nums[fast] != 0) {
                // 如果不为零，将快指针指向的值与慢指针指向的值交换
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                // 慢指针向后移动
                slow++;
            }
        }
    }
}
