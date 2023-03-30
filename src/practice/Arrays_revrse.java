package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_revrse{
	public static void main(String[] args) {

		int[] s1= {1, 2, 3, 4, 5};
		int[] rev= new int [s1.length];
		for(int i=0;i<s1.length;i++) {
			rev[i]=s1[s1.length-i-1];
		}
	
System.out.println(Arrays.toString(rev));


	}
}