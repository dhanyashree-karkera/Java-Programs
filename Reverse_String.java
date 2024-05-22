
public class Reverse_String {
	public static void main(String[] args) {
		String st1="DHANYASHREE";
		String st2="";
		
		for(int i=0;i<st1.length();i++) {
			st2=st1.charAt(i)+st2;
		}
		System.out.println("Reverse String is: "+st2);
	}

}
