package practicepage;

public class L1 {
	public static void main(String[] args) {
	String s1="vishalLA";
	int upper=0,lower=0;
	for(int i=0;i<=s1.length()-1;i++) {
		char ch = s1.charAt(i);
		if(ch>=65&&ch<=90) {
			upper++;
		}else {
			lower--;
		}
		
	}
	System.out.println("up->"+upper);
	System.out.println("lo->"+lower);
}}
