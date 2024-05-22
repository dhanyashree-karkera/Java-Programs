public class fibonacci {
	public static void main(String[] args) {
		int s1=0,s2=1;
		System.out.println(s1+"\n"+s2);
		for(int i=1;i<=8;i++) {
			int s3=s1+s2;
			System.out.println(s3);
			s1=s2;
			s2=s3;
		}
	}

}
