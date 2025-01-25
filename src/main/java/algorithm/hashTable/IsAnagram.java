package algorithm.hashTable;

import java.util.HashMap;

/**
 * 242.有效的字母异位词
 */
public class IsAnagram {
    /**
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char str : s.toCharArray()) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (char str : t.toCharArray()) {
            map.put(str, map.getOrDefault(str, 0) - 1);
        }
        for (Character key : map.keySet()) {
            if (map.get(key) != 0) return false;
        }
        return true;
    }
}
