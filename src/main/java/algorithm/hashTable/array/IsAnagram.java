package algorithm.hashTable.array;

import java.util.HashMap;

/**
 * 242.有效的字母异位词
 */
public class IsAnagram {
    /**
     * 数组
     * 时间复杂度：O(m+n)
     * 空间复杂度：O(1)
     * @param s
     * @param t
     * @return
     */
    /*public boolean isAnagram(String s, String t) {
        int[] records = new int[26];
        for (int i = 0; i < s.length(); i++) {
            records[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            records[t.charAt(i) - 'a']--;
        }
        for (int record: records) {
            if (record != 0) return false;
        }
        return true;
    }*/

    /**
     * 映射
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
