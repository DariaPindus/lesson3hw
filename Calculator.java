package ua.od.pindus;

import java.util.Scanner;

/**
 * Created by User on 30.03.2016.
 */
 /*. Добавить к калькулятору возможность ввода операции и чисел из консоли.
 В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию,
 далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.
  */
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        String op;

        System.out.println("Enter your operation: ");
        Scanner str=new Scanner(System.in);
        op=str.nextLine();
        System.out.println("Enter first number: ");
        a=str.nextInt();
        System.out.println("Enter second number: ");
        b=str.nextInt();

        switch (op){
            case "add":
                System.out.println("Result is " + (a+b));
                break;
            case "subtract":
                System.out.println("Result is " + (a-b));
                break;
            case "multiply":
                System.out.println("Result is " + (a*b));
                break;
            case "divide":
                System.out.println("Result is " + (a/(double)b));
                break;
            default:
                System.out.println("Incorrect input!");
        }
    }
}
