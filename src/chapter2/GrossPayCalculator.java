package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){

        System.out.println("How many hours employee worked?");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked= scanner.nextInt();

        System.out.println("Enter the hourly payrate:");
        double hourPayRate = scanner.nextDouble();

        double grossPay = hourPayRate*hoursWorked;
        System.out.println("The gross pay is " + grossPay);



    }


}
