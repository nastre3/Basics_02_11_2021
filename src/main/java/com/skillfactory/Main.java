package com.skillfactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hi, ");
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[10]; // массив из 10 элементов - нулей
        int[] arr3 = new int[]{1, 2, 3, 4};



        System.out.println(arr); // [ - массив, I - типа integer, @hashcode
        System.out.println(Arrays.toString(arr)); // массив в строковом представлении
    }
}
