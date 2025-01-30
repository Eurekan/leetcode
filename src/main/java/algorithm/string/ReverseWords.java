package algorithm.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 151.反转字符串中的单词
 */
public class ReverseWords {
    public String reverseWords(String s) {
        // 去除字符串两端的空白字符
        s = s.trim();

        // 使用正则表达式 "\\s+" 来分割字符串，它匹配一个或多个空格
        // Arrays.asList 将数组转换为列表
        List<String> wordList = Arrays.asList(s.split("\\s+"));

        // 反转列表中的元素顺序
        Collections.reverse(wordList);

        // 使用单个空格作为分隔符，将列表中的单词连接成一个字符串
        return String.join(" ", wordList);
    }
}
