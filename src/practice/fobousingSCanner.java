package practice;

import java.util.Scanner;

public class fobousingSCanner {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int count = scanner.nextInt();

    int n1 = 0, n2 = 1,n3;

    System.out.print("Fibonacci Series up to " + count + ": ");
    System.out.print(n1 + " " + n2);

    for (int i = 2; i <= count; i++) {
        n3 = n1 + n2;
        System.out.print(" " + n3);
       n1 = n2;
        n2 = n3;
    }
}
}
