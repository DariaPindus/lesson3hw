package ua.od.pindus;

import java.util.Scanner;

/**
 * Created by User on 30.03.2016.
 */
/*Тот же калькулятор, только операция и числа вводятся как параметры из командной строки в "Edit Configuration".
(попробуйте после того как запустили в IDE запустить приложение из консоли с передачей параметров).*/
public class CalculatorWithParam {
    public static void main(String[] args) {
        int a, b;
        String op;

        op = args[0];
        a = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);

        switch (op) {
            case "add":
                System.out.println("Result is " + (a + b));
                break;
            case "subtract":
                System.out.println("Result is " + (a - b));
                break;
            case "multiply":
                System.out.println("Result is " + (a * b));
                break;
            case "divide":
                System.out.println("Result is " + (a / (double) b));
                break;
            default:
                System.out.println("Incorrect input!");
        }
    }
}
