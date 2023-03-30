package practice;

import java.util.Scanner;

public class vowel {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char ch = Character.toLowerCase(str.charAt(i));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }

    System.out.println("The number of vowels in the string is: " + count);
}
}
