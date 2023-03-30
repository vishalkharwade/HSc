package practicepage;

public class L3 {
	public static void main(String[] args) {
		String org="vishal";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
