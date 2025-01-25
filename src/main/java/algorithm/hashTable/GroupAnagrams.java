package algorithm.hashTable;

import java.util.*;

/**
 * 49.字母异位词分组
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 创建一个HashMap用于存储排序后的字符串和原字符串的映射关系
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 将字符串转换成字符数组
            char[] charArray = str.toCharArray();
            // 对字符数组进行排序
            Arrays.sort(charArray);
            // 将排序后的字符数组转回字符串
            String sortedStr = new String(charArray);

            // 如果map中不存在该排序后的字符串，则创建一个新的列表
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // 将原始字符串添加到对应排序字符串的列表中
            map.get(sortedStr).add(str);
        }

        // 返回map中所有的值，即分组后的字母异位词列表
        return new ArrayList<>(map.values());
    }
}
