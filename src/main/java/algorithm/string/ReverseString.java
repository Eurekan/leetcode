package algorithm.string;

/**
 * 344.反转字符串
 */
public class ReverseString {
    /**
     * 时间复杂度: O(n)
     * 空间复杂度: O(1)
     * @param s
     */
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
