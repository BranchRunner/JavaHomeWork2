package com.pb.bondarev.hw4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean equalsWords(String w1, String w2) {
        return wordToMap(w1).equals(wordToMap(w2));
    }

    public static Map<String, Integer> wordToMap(String w) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : w.split("")) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.replace(s, 1 + map.get(s));
            }
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть перше речення:");

        String rech1 = scan.nextLine();

        System.out.println("Введіть друге речення:");

        String rech2 = scan.nextLine();

        System.out.println("Результат: " + equalsWords(rech1, rech2));


    }
}
