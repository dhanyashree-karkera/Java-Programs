public class Generate_1To100 {
	public static void main(String[] args) {
		for(int j=0;j<=100;j++) {
			int n=j;
			int count=0;
			int i=2;
			
			while(i<=n/2) {
				if(n%i==0) {
					count++;
					break;
				}
				i++;
			}
			if(count==0) {
				System.out.println(n);
			}
		}
	}

}
