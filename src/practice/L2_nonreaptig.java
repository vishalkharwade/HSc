package practice;

public class L2_nonreaptig {
	public static void main(String[] args) {
		
	
	String org="Vasssjsjsjssjjsj";
	int count =0;
	for(int i=0;i<=org.length()-1;i++) {
		char s1 = org.charAt(i);
		if(s1=='V') {
			count++;
		}
	}
	System.out.println("no reapting="+count);
	}
}
