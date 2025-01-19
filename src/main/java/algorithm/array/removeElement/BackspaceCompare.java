package algorithm.array.removeElement;

/**
 * 844.比较含退格的字符串
 */
public class BackspaceCompare {

    public boolean backspaceCompare(String s, String t) {
        // 初始化字符串s和t的长度
        int i = s.length() - 1, j = t.length() - 1;
        // 初始化两个字符串跳过变量为零
        int skipS = 0, skipT = 0;
        // 同时逆序遍历字符串
        while (i >= 0 || j >= 0) {
            // 对于 s，找到下一个有效的字符索引
            while (i >= 0) {
                if (s.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }

            // 对于 T，找到下一个有效的字符索引
            while (j >= 0) {
                if (t.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }

            // 判断字符串是否有效和当前有效字符是否相等
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;

            // 如果一个字符串已经结束而另一个没有，则它们不相等
            if ((i >= 0) != (j >= 0)) return false;

            i--; j--;
        }

        return true;
    }
}
