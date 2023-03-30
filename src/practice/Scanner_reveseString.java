package practice;


import java.util.Arrays;
import java.util.Scanner;

public class Scanner_reveseString {
public static void main(String[] args) {

Scanner s1=new Scanner(System.in);
System.out.println("Enter String");
String org = s1.nextLine();
StringBuilder sb=new StringBuilder();


for(int i=org.length()-1;i>=0;i--) {
sb.append(org.charAt(i));
}
System.out.println("reverse:->");
System.out.println(sb.toString());
}

}
	

	
	
