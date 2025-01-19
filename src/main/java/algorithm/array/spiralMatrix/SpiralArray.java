package algorithm.array.spiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class SpiralArray {
    public static int[] spiralArray(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();

        // 检查矩阵是否为空或是否包含空行
        if (array == null || array.length == 0 || array[0].length == 0) {
            return new int[0];
        }

        int left = 0, right = array[0].length - 1, top = 0, bottom = array.length - 1;

        while (left <= right && top <= bottom) {
            // 从左到右遍历顶行
            for (int col = left; col <= right; col++) {
                list.add(array[top][col]);
            }
            top++;

            // 从上到下遍历右列
            for (int row = top; row <= bottom; row++) {
                list.add(array[row][right]);
            }
            right--;

            // 如果还有有效的行，从右到左遍历底行
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(array[bottom][col]);
                }
                bottom--;
            }

            // 如果还有有效的列，从下到上遍历左列
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(array[row][left]);
                }
                left++;
            }
        }

        // 直接转换为 int 数组
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(spiralArray(matrix)));
    }
}
