
public class RepaetedCharacter {
	public static void main(String[] args) {
		String s1="DHANYASHREE";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Reapeated Character is "+ch[i]);
					break;
				}
			}
		}
	}

}
