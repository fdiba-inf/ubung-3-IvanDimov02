package exercise3;

import java.util.Scanner;

public class PrimeNumber {
  
  public static void main (String[] args) {
   Scanner input = new Scanner(System.in);
   
   int n = input.nextInt();
   boolean prime= true;
   int a = 2;
   
   while (n > 2) {
     if (n !=a && n % a == 0 ) {
       prime = false;
       break;
     }
     if (a== 100) {
       break;
     }
     a++;
   }
   System.out.println("Prime number: " + prime);
  }
}