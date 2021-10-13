package com.pb.bondarev.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        int result;
        String sign;

        System.out.println("Введіть ціле значення operand1:");
        operand1 = scan.nextInt();

        System.out.println("Введіть ціле значення operand2:");
        operand2 = scan.nextInt();

        System.out.println("Введіть арефметичну операцію яку необхідно виконати з operand1 та operand2:");

        sign = scan.next();

        System.out.println("operand1 = " + operand1);
        System.out.println("operand2 = " + operand2);
        if (sign.equals("+")) {
            System.out.println("Буде виконана наступна дія: " + sign + " - додавання");
        }
        if (sign.equals("-")) {
            System.out.println("Буде виконана наступна дія: " + sign + " - віднімання");
        }
        if (sign.equals("*")) {
            System.out.println("Буде виконана наступна дія: " + sign + " - множення");
        }
        if (sign.equals("/")) {
            System.out.println("Буде виконана наступна дія: " + sign + " - ділення");
        }

        switch (sign) {
            case "+":
                result = operand1 + operand2;
                System.out.println("Результат: " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.println("Результат: " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.println("Результат: " + result);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На 0 ділити не можна!!!");
                }
                else {
                    result = operand1 / operand2;
                    System.out.println("Результат: " + result);
                }
                break;
        }

    }

}
