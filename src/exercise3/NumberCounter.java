package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();
        double positive = 0.0;
        double negative = 0.0;
        double sum = 0.0;
        

        while (number != 0.0) {
          if (number > 0.0) {
            positive++;
          } else {
            negative++;
          }
          sum = sum + number;
          number = input.nextDouble();
        }

        double average = sum / (positive + negative);
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}

