package practice;

public class L1_upper_lower {
	public static void main(String[] args) {
		
	
	String S1="VishalKharwade";
	int upper=0;
	int lower=0;
	for(int i=0;i<=S1.length()-1;i++) {
	char ch=	S1.charAt(i);
		if(ch>=65&&ch<=90) {
			upper++;
		}else {
			lower++;		}
		
		
	}
	System.out.println("upper--"+upper);
System.out.println("lower--"+lower);
}}
