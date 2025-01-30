package algorithm.string;

/**
 * 541.反转字符串Ⅱ
 * 题意：每隔 2k 个反转前 k 个，尾数不够 k 个时候全部反转
 */
public class ReverseStr {
    /**
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, ch.length - 1);
            while (start < end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
