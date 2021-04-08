package lesson_b;

import java.util.Arrays;

public class HomeWorkTwo {
    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0
     */
    private static void change(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] == 1){
                array[i] = 0;
            }else array[i] = 1;
        }
    }
    /**
     * Задать пустой целочисленный массив размером 8.
     * Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
     */
    private static void fillIn(int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] = 1 + i * 3;
        }
    }
    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
     * написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2
     */
    private static void doubling (int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
    }
    /**
     * Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
     */
    private static int findMin (int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (min > array[i])
                min = array[i];
        }
        return min;
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * заполнить его диагональные элементы единицами, используя цикл(ы)
     */
    private static void printArray (int[][] array){
        for (int i = 0; i <array.length; i++){
            System.out.println (Arrays.toString(array[i]));
        }
    }
    private static void crossFill (int[][] array){
        int strght;
        int bckwd;
        for (strght = 0, bckwd = array.length - 1;
             strght < array.length;
             strght++, bckwd--){
            array[strght][strght] = 1;
            array[strght][bckwd] = 1;
        }
    }
    public static void main (String[] args){

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1));
        change(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("-------------");
        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
        fillIn(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("-------------");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        doubling(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------");
        int[] arr4 = {1,2,3,4};
        System.out.println(Arrays.toString(arr4));
        System.out.println(findMin(arr4));

        System.out.println("-------------");
        int[] arr5 = {1,2,3,4};
        System.out.println(Arrays.toString(arr5));
        System.out.println(findMax(arr5));

        System.out.println("-------------");
        int[][] arr6 = new int[7][7];
        crossFill(arr6);
        printArray(arr6);
    }
}
