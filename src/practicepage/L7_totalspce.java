package practicepage;

public class L7_totalspce {
	public static void main(String[] args) {
		String org="V I S S h";
		int count=0;
		for(int i=0;i<=org.length()-1;i++) {
		char ch=	org.charAt(i);
		if(ch==' ') {
			count++;
		}
		
		
		}
		System.out.println("no priem-"+count);
	}

}
