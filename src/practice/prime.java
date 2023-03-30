package practice;



public class prime {
	public static void main(String[] args) {
		
	
	int s=12;
	int count=0;
	for(int i=2;i<s;i++) {
		if(s%i==0) {
			count++;
			break;
		}
	}
	if(count==1) {
		System.out.println("not prime");
	}else {
		System.out.println("is prime");
	}
	}
}
