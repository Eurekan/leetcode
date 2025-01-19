package algorithm.begin;

/**
 * 给你一个下标从 0 开始的字符串数组 words 和两个整数：left 和 right 。
 * 如果字符串以元音字母开头并以元音字母结尾，那么该字符串就是一个 元音字符串 ，其中元音字母是 'a'、'e'、'i'、'o'、'u' 。
 * 返回 words[i] 是元音字符串的数目，其中 i 在闭区间 [left, right] 内。
 */
public class VowelStrings {
    public static void main(String[] args) {
        VowelStrings strings = new VowelStrings();
        String[] words = {"are","amy","u"};
        int result = strings.vowelStrings(words, 0, 2);
        System.out.println(result);
    }

    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;

        // 遍历指定范围内的单词
        for (int i = left; i <= right && i < words.length; i++) {
            if (isVowelString(words[i])) {
                count++;
            }
        }

        return count;
    }

    // 辅助方法：检查字符串是否是元音字符串
    private boolean isVowelString(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));

        return isVowel(firstChar) && isVowel(lastChar);
    }

    // 辅助方法：检查字符是否为元音
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}
