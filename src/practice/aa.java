package practice;


import java.util.Scanner;

public class aa {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();
    String reversedString = reverseWords(inputString);
    System.out.println("Reversed words: " + reversedString);
}

public static String reverseWords(String s) {
    String[] words = s.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        String reversedWord = reverseString(words[i]);
        sb.append(reversedWord);
        if (i < words.length - 1) {
            sb.append(" ");
        }
    }
    return sb.toString();
}

public static String reverseString(String s) {
    StringBuilder sb = new StringBuilder(s);
    return sb.reverse().toString();
}
}
