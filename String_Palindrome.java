public class String_Palindrome {
	public static void main(String[] args) {
		String s1="level";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
			
		}
		if(s1.equals(s2)) {
			System.out.println(s1+" is palindrome");
		}
		else {
			System.out.println(s1+" is not palindrome");
		}
	}

}
