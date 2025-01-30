package algorithm.string;

public class RightRotate {
    public static String rightRotate(String s, int k) {
        // 获取字符串长度
        int len = s.length();
        // 计算有效旋转位数
        k = k % len;
        if (k == 0) return s; // 如果k是字符串长度的整数倍，则直接返回原字符串

        // 分割字符串并重新组合
        String tail = s.substring(len - k);
        String head = s.substring(0, len - k);

        // 返回旋转后的字符串
        return tail + head;
    }

    public static void main(String[] args) {
        // 样例输入
        int k = 2;
        String s = "abcdefg";

        // 调用函数并打印结果
        System.out.println(rightRotate(s, k)); // 应输出: fgabcde
    }
}
