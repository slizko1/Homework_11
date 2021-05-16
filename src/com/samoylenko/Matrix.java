//        2*. Написать вспомогательный класс для работы с матрицами (2-мерными массивами), методы:
package com.samoylenko;


import java.sql.Array;
import java.util.Arrays;

public class Matrix {

    //        print(int[][] matrix) - печатает матрицу
    public static void print(int[][] matrix) {
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    //        swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
    public static void swapColumns(int[][] matrix, int column1, int column2) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            tmp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = tmp;
        }
    }

    //        swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
    public static void swapRows(int[][] matrix, int row1, int row2) {
        int tmp;
        for (int i = 0; i < matrix.length; i++) {
            tmp = matrix[row1][i];
            matrix[row1][i] = matrix[row2][i];
            matrix[row2][i] = tmp;
        }
    }

    //        mul(int[][] matrix, int value) - умножает матрицу на число
    public static void mul(int[][] matrix, int value) {
        System.out.println(matrix[0].length);
        System.out.println(matrix.length - 1);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= value;
            }
        }
    }

    //        toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
    public static int[] toArray(int[][] matrix) {
        int[] array = new int[matrix[0].length * matrix.length];
        int arrayLength = matrix[0].length * matrix.length;
        int indexArrayElement = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                array[indexArrayElement] = matrix[i][j];
                indexArrayElement++;
            }
        }
        return array;
    }

    //        max(int[][] matrix) - возвращает максимальный элемент матрицы
    public static int max(int[][] matrix) {
        int max = 0;
        for (int[] row : matrix)
            for (int element : row)
                if (element > max) {
                    max = element;
                }
        return max;
    }
}