package practicepage;



public class prome {
	public static void main(String[] args) {
		
		int num=12;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num/2==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println("is not prime");
		}else {
			System.out.println("is prime");
		}
	}
}
