package practice;

import java.util.Scanner;

public class interview {
public static void main(String[] args) {

	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = scanner.nextInt();
     int fact = 1;
     for (int i = 1; i <= num; i++) {
         fact *= i;
     }
     System.out.println("Factorial of " + num + " is " + fact);
}
}
