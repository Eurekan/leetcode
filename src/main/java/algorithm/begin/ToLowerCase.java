package algorithm.begin;

/**
 * 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
 */
public class ToLowerCase {
    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        String result = toLowerCase.toLowerCase("Hello");
        System.out.println(result);
    }

    public String toLowerCase(String s) {
        int dif = 'A' - 'a';
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z') chars[i] -= (char) dif;
        }
        return String.valueOf(chars);
    }
}
