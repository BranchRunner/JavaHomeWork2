package com.pb.bondarev.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        String sign;

        System.out.println("Введіть ціле число:");
        a = scan.nextInt();

        if (a >= 0 && a <= 14) {
            System.out.println("Число знаходиться у проміжку [0-14]");
        }
            else {
                if (a >= 15 && a <= 35) {
                    System.out.println("Число знаходиться у проміжку [15-35]");
                }
                else {
                    if (a >= 36 && a <= 50) {
                        System.out.println("Число знаходиться у проміжку [36-50]");
                    }
                    else {
                        if (a >= 51 && a <= 100) {
                            System.out.println("Число знаходиться у проміжку [51-100]");
                        }
                        else {
                            System.out.println("Число не входить в жоден відомий проміжок!!!");
                        }
                    }
                }
                }
    }
}
