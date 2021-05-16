package com.samoylenko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
    }

    //1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
//        Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
//        Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
//        Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
//        Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
//        не было человека весом 3 кг и ростом 180 итд.
    public static void task1() {
        List<Person> listOfPeople = new ArrayList<>();
        FillingOutTheList.fill(listOfPeople);
        System.out.println(listOfPeople);
    }

    //        2*. Написать вспомогательный класс для работы с матрицами (2-мерными массивами), методы:
//        print(int[][] matrix) - печатает матрицу
//        swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
//        swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
//        mul(int[][] matrix, int value) - умножает матрицу на число
//        toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элементов
//        max(int[][] matrix) - возвращает максимальный элемент матрицы
    public static void task2() {
        int[][] matrix = {{5, 7, 3, 17},
                {7, 0, 1, 12},
                {8, 1, 2, 3}};
        Matrix.print(matrix);
        Matrix.swapColumns(matrix, 1, 2);
        System.out.println("=====================");
        Matrix.print(matrix);
        System.out.println("=====================");
        Matrix.swapRows(matrix, 1, 2);
        Matrix.print(matrix);
        System.out.println("=====================");
        Matrix.mul(matrix, 2);
        Matrix.print(matrix);
        System.out.println("=====================");
        System.out.println(Arrays.toString(Matrix.toArray(matrix)));
        System.out.println("=====================");
        System.out.println(Matrix.max(matrix));
    }
}


