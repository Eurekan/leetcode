package algorithm.array.removeElement;

/**
 * 27.移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 返回 k。
 * 提示：
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */
public class RemoveElement {

    /**
     * 暴力法
     * @param nums 数组
     * @param val 值
     * @return 移除值后的数组长度
     */
    public int removeElement(int[] nums, int val) {
        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 判断是否为要移除的元素
            if (nums[i] == val) {
                // 更新数组
                for (int j = i + 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                    i--;
                    j--;
                }
            }
        }
        return nums.length;
    }

    /**
     * 快慢指针（快指针寻找新数组，慢指针指向新数组下标）：通过快慢指针在一个for循环完成两个for循环的工作
     * @param nums 数组
     * @param val 值
     * @return 移除值后的数组长度
     */
    public int removeElementByFastAndSlow(int[] nums, int val) {
        // 定义快慢指针
        int slow = 0;
        // 快指针遍历数组
        for (int fast = 0; fast < nums.length; fast++) {
            // 判断快指针指向的元素是否为目标值
            if (nums[fast] != val) {
                // 慢指针更新数组
                nums[slow] = nums[fast];
                // 慢指针向后移动
                slow++;
            }
        }
        // 返回慢指针
        return slow;
    }
}
