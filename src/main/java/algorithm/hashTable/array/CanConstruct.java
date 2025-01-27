package algorithm.hashTable.array;

import java.util.HashMap;

/**
 * 383.赎金信
 */
public class CanConstruct {
    /**
     * 数组
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param ransomNote
     * @param magazine
     * @return
     */
    /*public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > ransomNote.length()) return false;
        int[] records = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            records[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            records[ransomNote.charAt(i) - 'a']--;
        }
        for (int record : records) {
            if (record < 0) return false;
        }
        return true;
    }*/

    /**
     * 映射
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) < 0) return false;
        }
        return true;
    }
}
