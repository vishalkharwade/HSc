package practicepage;

public class L4 {
	public static void main(String[] args) {
		
		String inpstr="stress";
		for(char i:inpstr.toCharArray()) {
			if(inpstr.indexOf(i)==inpstr.lastIndexOf(i)) {
				System.out.println("non repwted--"+i);
				break;
			}
		}
		
	}

}
