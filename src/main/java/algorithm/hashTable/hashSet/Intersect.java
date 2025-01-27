package algorithm.hashTable.hashSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 350.两个数组的交集Ⅱ
 */
public class Intersect {
    /**
     * 时间复杂度：O(n + m)
     * 空间复杂度：O(min(n, m))
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
