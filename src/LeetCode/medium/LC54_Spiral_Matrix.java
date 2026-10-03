package LeetCode.medium;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class LC54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && top <= bottom) {

            leftToRight(matrix, top, left, right, res);
            top++; // Верхню стіну зміщуємо вниз

            if (left <= right && top <= bottom) {
                rightSide(matrix, right, top, bottom, res);
                right--;
            }

            if (left <= right && top <= bottom) {
                rightToLeft(matrix, bottom, right, left, res);
                bottom--;
            }

            if (left <= right && top <= bottom) {
                leftSide(matrix, left, bottom, top, res);
                left++;
            }
        }

        return res;
    }

    private static void leftToRight(int[][] matrix, int row, int fromCol, int toCol, List<Integer> res) {
        for (int j = fromCol; j <= toCol; j++) {
            res.add(matrix[row][j]);
        }
    }

    private static void rightSide(int[][] matrix, int col, int fromRow, int toRow, List<Integer> res) {
        for (int i = fromRow; i <= toRow; i++) {
            res.add(matrix[i][col]);
        }
    }

    private static void rightToLeft(int[][] matrix, int row, int fromCol, int toCol, List<Integer> res) {
        for (int j = fromCol; j >= toCol; j--) {
            res.add(matrix[row][j]);
        }
    }

    private static void leftSide(int[][] matrix, int col, int fromRow, int toRow, List<Integer> res) {
        for (int i = fromRow; i >= toRow; i--) {
            res.add(matrix[i][col]);
        }
    }


}
