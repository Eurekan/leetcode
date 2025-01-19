package algorithm.begin;

/**
 * 给你一个由若干 0 和 1 组成的字符串 s ，请你计算并返回将该字符串分割成两个 非空 子字符串（即 左 子字符串和 右 子字符串）所能获得的最大得分。
 * 「分割字符串的得分」为 左 子字符串中 0 的数量加上 右 子字符串中 1 的数量。
 */
public class MaxScore {
    public static void main(String[] args) {
        MaxScore score = new MaxScore();
        int result = score.maxScore("011101");
        System.out.println(result);
    }

    public int maxScore(String s) {
        int maxScore = 0;

        // 遍历所有可能的分割点
        for (int i = 1; i < s.length(); i++) {
            String leftPart = s.substring(0, i);
            String rightPart = s.substring(i);

            // 计算当前分割下的得分
            int score = countChar(leftPart, '0') + countChar(rightPart, '1');

            // 更新最大得分
            if (score > maxScore) {
                maxScore = score;
            }
        }

        return maxScore;
    }

    // 辅助方法：计算某个字符在字符串中出现的次数
    private int countChar(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
