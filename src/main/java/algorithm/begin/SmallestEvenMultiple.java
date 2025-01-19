package algorithm.begin;

/**
 * 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 */
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        int result = smallestEvenMultiple.smallestEvenMultiple(5);
        System.out.println(result);
    }

    public int smallestEvenMultiple(int n) {
        return n%2==0?n:n*2;
    }
}
