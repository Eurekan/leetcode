package algorithm.begin;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * 如果可以，返回 true ；否则返回 false 。
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 * 示例 1：
 * 输入：ransomNote = "a", magazine = "b"
 * 输出：false
 * 示例 2：
 * 输入：ransomNote = "aa", magazine = "ab"
 * 输出：false
 * 示例 3：
 * 输入：ransomNote = "aa", magazine = "aab"
 * 输出：true
 * 提示：
 * 1 <= ransomNote.length, magazine.length <= 105
 * ransomNote 和 magazine 由小写英文字母组成
 */
public class CanConstruct {
    public static void main(String[] args) {
        CanConstruct canConstruct = new CanConstruct();
        boolean result = canConstruct.canConstruct("aa", "abc");
        System.out.println(result);
    }

    /**
     * 数组
     * @param ransomNote
     * @param magazine
     * @return
     */
    /*public boolean canConstruct(String ransomNote, String magazine) {
        // 如果ransomNote的长度大于magazine的长度，直接返回false。
        // 因为如果ransomNote更长，那么肯定无法用magazine中的字符完全构建出来。
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        // 创建一个长度为26的数组，用于记录magazine中每个小写字母的数量。
        int[] cnt = new int[26];

        // 遍历magazine字符串，对于magazine中的每个字符：
        for (char c : magazine.toCharArray()) {
            // 增加对应字符在cnt数组中的计数。
            // 'c - 'a'' 将字符转换为0到25之间的索引值，例如'a' -> 0, 'b' -> 1, ..., 'z' -> 25。
            cnt[c - 'a']++;
        }

        // 遍历ransomNote字符串，对于ransomNote中的每个字符：
        for (char c : ransomNote.toCharArray()) {
            // 减少对应字符在cnt数组中的计数。
            cnt[c - 'a']--;

            // 检查减少后的计数是否小于0。
            // 如果是，则说明magazine中没有足够的该字符来构建ransomNote，因此返回false。
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }

        // 如果成功遍历完ransomNote而未遇到计数小于0的情况，则返回true，
        // 表示magazine中有足够的字符来构建ransomNote。
        return true;
    }*/


    /**
     * 哈希表
     * @param ransomNote 勒索信
     * @param magazine 杂志
     * @return boolean
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }
        return true;
    }
}
