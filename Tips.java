package ua.od.pindus;

import java.util.Scanner;

/**
 * Created by User on 30.03.2016.
 */
/*входные данные: сумма, которую вы должны заплатить и уровень сервиса
в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
- terrible (0%)
- poor (5%)
- good (10%)
- great (15%)
- excellent (20%)*/
public class Tips {
    public static void main(String[] args) {
        float sum, totalSum = 0;
        String lvlOfService;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sum: ");
        sum = sc.nextInt();

        System.out.println("Enter the level of service: ");
        lvlOfService = sc.next();

        totalSum = sum;


        switch (lvlOfService) {
            case "terrible":
                totalSum = sum;
                break;
            case "poor":
                totalSum += 0.05F * sum;
                break;
            case "good":
                totalSum += 0.1F * sum;
                break;
            case "great":
                totalSum += 0.15F * sum;
                break;
            case "excellent":
                totalSum += 0.2F * sum;
                break;
            default:
                System.out.println("Incorrect input!");
        }
        System.out.println("Your total price is " + totalSum);
    }
}
