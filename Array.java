package com.pb.bondarev.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int sum;
        int kildod = 0;
        int buf;
        boolean sorted = false;

        System.out.println("Введіть 10-ть елементів масиву:");
        array [0] = scan.nextInt();
        array [1] = scan.nextInt();
        array [2] = scan.nextInt();
        array [3] = scan.nextInt();
        array [4] = scan.nextInt();
        array [5] = scan.nextInt();
        array [6] = scan.nextInt();
        array [7] = scan.nextInt();
        array [8] = scan.nextInt();
        array [9] = scan.nextInt();

        System.out.println("Ваш масив:");
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4] + ", " + array[5] + ", " + array[6] + ", " + array[7] + ", " + array[8] + ", " + array[9] + ".");

        System.out.println("Сума масиву:");
        sum = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];
        System.out.println(sum);

        System.out.println("Додатні числа масиву:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();

        System.out.println("Кількість додатніх чисел масиву:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                kildod++;
            }
        }
        System.out.println(kildod);

        System.out.println("Cортування масиву від мінімального до максимального значе:");

        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                    sorted = false;
                }
            }
        }
                System.out.println(array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4] + ", " + array[5] + ", " + array[6] + ", " + array[7] + ", " + array[8] + ", " + array[9] + ".");
    }
}
