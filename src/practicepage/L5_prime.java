package practicepage;

public class L5_prime{
public static void main(String[] args) {
	int num=7;
	int count=0;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			count++;
			break;
			
		}
		
	}
	if(count==1) {
		System.out.println("is not prime");
	}else {
		System.out.println("is");
	}
	}



	
}
