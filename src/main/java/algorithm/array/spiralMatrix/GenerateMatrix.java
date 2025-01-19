package algorithm.array.spiralMatrix;

import java.util.Arrays;

/**
 * 54.螺旋矩阵
 */
public class GenerateMatrix {
    public static int[][] generateMatrix(int n) {
        // 初始化 n x n 的矩阵，所有元素都设为默认值 0
        int[][] matrix = new int[n][n];
        int num = 1; // 从1开始填充矩阵
        int top = 0, bottom = n - 1, left = 0, right = n - 1; // 定义上下左右边界

        // 当 num 小于等于 n * n 时继续循环
        while (num <= n * n) {
            // 从左到右填充顶部行
            for (int col = left; col <= right; col++) {
                matrix[top][col] = num++;
            }
            top++; // 上边界下移一行

            // 从上到下填充右侧列
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = num++;
            }
            right--; // 右边界左移一列

            // 从右到左填充底部行
            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = num++;
            }
            bottom--; // 下边界上移一行

            // 从下到上填充左侧列
            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = num++;
            }
            left++; // 左边界右移一列
        }

        return matrix;
    }

    public static void main(String[] args) {
        int[][] result = generateMatrix(3);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
