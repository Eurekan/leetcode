package algorithm.hashTable;

import java.util.ArrayList;
import java.util.List;

/**
 * 438.找到字符串中所有字母异位词
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // 统计 p 中每个字符的频率
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int windowSize = p.length();
        int left = 0;

        // 滑动窗口遍历 s
        for (int right = 0; right < s.length(); right++) {
            // 统计当前窗口内字符的频率
            sCount[s.charAt(right) - 'a']++;

            // 当窗口大小等于 p 的长度时，开始比较
            if (right - left + 1 == windowSize) {
                if (matches(sCount, pCount)) {
                    result.add(left);
                }

                // 移动窗口左边界，并减少左边界的字符频率
                sCount[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }

    // 比较两个字符频率数组是否相等
    private boolean matches(int[] sCount, int[] pCount) {
        for (int i = 0; i < 26; i++) {
            if (sCount[i] != pCount[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        FindAnagrams solution = new FindAnagrams();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(solution.findAnagrams(s, p)); // 输出: [0, 6]

        s = "abab";
        p = "ab";
        System.out.println(solution.findAnagrams(s, p)); // 输出: [0, 1, 2]
    }
}
