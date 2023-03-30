package practice;

public class findDuplicate {
	public static void main(String[] args) {
	
	
	int []s1= {5,2,3,1,3,4,5,67,7,77,77};
	System.out.println("duplicate");
	for(int i=0;i<s1.length;i++) {
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i]==s1[j]) {
				System.out.println(s1[j]);
			}
		}
		
	}
	}
}
