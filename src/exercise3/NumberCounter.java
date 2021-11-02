package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        double sum = 0.0;
        int pos = 0;
        int neg = 0;

        while( i != 0){

          if(i >= 0){
            pos ++;
          }
          else{
            neg ++;
          }
          sum = sum + i;
          i = input.nextInt();
        }
        double aver = sum/(pos + neg);

        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + aver);



        
    }

}