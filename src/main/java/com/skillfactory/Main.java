package com.skillfactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Arrays

        System.out.printf("Hi, ");
        int[] arr = {1, 2, 3};
        int[] arr2 = new int[10]; // массив из 10 элементов - нулей
        int[] arr3 = new int[]{11, 23, 33, 42};
        for (int i=0; i< arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        for (int a: arr3) {
            System.out.println(a);
        }

        System.out.println(arr); // [ - массив, I - типа integer, @hashcode
        System.out.println(Arrays.toString(arr)); // массив в строковом представлении

        //Strings
        String str = "Some string 123"; // строка в String pool
        String str1 = "Some string 123"; // строка в String pool
        String str2 = new String("Some string 123"); // создан в куче (память выделили самостоятельно)
        System.out.println(str==str1);
        System.out.println(str==str2);
        str2 = str2.intern(); // intern вернет ссылку и str2 попадет в String pool
        System.out.println(str==str2);

        // Scanner
        Scanner sc = new Scanner(str); // чтение из строки
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            } else {
                sc.next();
            }
        }

        Scanner sc2 = new Scanner(System.in); // System.in - чтение из консоли
        while (sc2.hasNext()) {
            if (sc2.hasNextInt()) {
                System.out.println(sc2.nextInt());
            } else if (sc2.next().equals("x")){ // при символе x
               break; // выход из цикла
            }
        }
/*
        Scanner sc3 = new Scanner(new File("input.txt")); // чтение из файла
        while (sc3.hasNext()) {
            if (sc3.hasNextInt()) {
                System.out.println(sc3.nextInt());
            } else if (sc3.next().equals("x")){ // при символе x
                break; // выход из цикла
            }
        }*/
    }
}
