package com.pb.bondarev.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        String kin;
        int a;
        int attempt = 1;
        int min = 0;
        int max = 100;
        int x = random.nextInt((max - min) + 1) + min;

        System.out.println(x);
        System.out.println("Спробуйте вгадати число від 0 до 100: ");
        a = scan.nextInt();

        if (a == x) {
            System.out.println("Вітаю! Ви вгадали з " + attempt + " спроби!");
        }
        while (a != x) {
                attempt++;
                System.out.println("Ой, не вийшло!");
                if (a > x) {
                    System.out.println("Задумане число менше!");
                }
                if (a < x) {
                    System.out.println("Задумане число більше!");
                }
                System.out.println("Бажаєте продовжити? (Y/N)");
                kin = scan.next();
                if (kin.equals("N")) {
                    System.out.println("Дякую за гру!");
                    break;
                }
                System.out.println("Спроба - " + attempt +"." + " Спробуйте вгадати число від 0 до 100: ");
                a = scan.nextInt();
                if (a == x) {
                    System.out.println("Вітаю! Ви вгадали з " + attempt + " спроби!");
                    continue;
                }
        }


    }
}
