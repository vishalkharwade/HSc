package practicepage;

public class L2 {
	public static void main(String[] args) {
		
	
		String s1="AANNAbbauuhisihdhdhhhhhhhhhhhhh";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++) {
			char ch = s1.charAt(i);
			if(ch=='a') 
			{
				count++;
			}
			
		}
		System.out.println("no reapting charter="+count);
	}
}
