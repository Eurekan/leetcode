package algorithm.hashTable.hashMap;

import java.util.HashMap;

/**
 * 454.四数相加Ⅱ
 */
public class FourSumCount {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // 统计两个数组元素之和，同时统计出现的次数，放入map
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        // 统计剩余两个元素之和，在map中找是否存在相反数，同时记录次数
        for (int i : nums3) {
            for (int j : nums4) {
                int target = -(i + j);
                count += map.getOrDefault(target, 0);
            }
        }

        return count;
    }
}
