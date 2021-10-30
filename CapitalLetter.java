package com.pb.bondarev.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Введіть речення:");

        String rech = scan.nextLine();

        char[] chars = rech.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        rech = new String(chars);
        System.out.println(rech);
    }
}
