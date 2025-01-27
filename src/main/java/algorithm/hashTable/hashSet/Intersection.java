package algorithm.hashTable.hashSet;

import java.util.HashSet;
import java.util.Set;

/**
 * 349.两个数组的交集
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(x -> x).toArray();
    }
}
