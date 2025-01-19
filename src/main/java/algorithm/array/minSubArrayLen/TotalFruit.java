package algorithm.array.minSubArrayLen;

import java.util.HashMap;

/**
 * 904.水果成篮
 */
public class TotalFruit {

    /**
     * 滑动窗口
     * 时间复杂度：O(n)，其中 n 是数组 fruits 的长度。
     * 空间复杂度：O(1)。哈希表中最多会有三个键值对，可以看成使用了常数级别的空间。
     * @param fruits
     * @return
     */
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, right - left - 1);
        }
        return ans;
    }
}
