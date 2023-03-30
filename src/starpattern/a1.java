package starpattern;

import java.util.Scanner;

public class a1 {
public static void main(String[] args) {
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Enter name");
	String org = s1.nextLine();
	StringBuilder rev=new StringBuilder();
	for(int i=org.length()-1;i>=0;i--) {
		rev.append(org.charAt(i));
	}
	System.out.println("result");
	System.out.println(rev.toString());
}
}
