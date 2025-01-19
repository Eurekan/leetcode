package algorithm.begin;

/**
 * 给定一个长度为 n 的整数 山脉 数组 arr ，其中的值递增到一个 峰值元素 然后递减。
 * 返回峰值元素的下标。
 * 你必须设计并实现时间复杂度为 O(log(n)) 的解决方案。
 */
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        PeakIndexInMountainArray peak = new PeakIndexInMountainArray();
        int[] arr = new int[]{0,10,5,2};
        int result = peak.peakIndexInMountainArray(arr);
        System.out.println(result);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int index;
        for (index = 0; index < arr.length; index++) {
            if (index != arr.length - 1) {
                if (arr[index] > arr[index + 1]) {
                    return index;
                }
            }
        }
        return index;
    }
}
