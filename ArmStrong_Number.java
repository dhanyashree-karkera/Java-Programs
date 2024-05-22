public class ArmStrong_Number {
	public static void main(String[] args) {
		int n=153;
		int n1=n;
		int n2=n;
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
			
		}
		int rem=0;
		int sum=0;
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			for(int i=1;i<=count;i++) {
				pow=pow*rem;
			}
				sum=sum+pow;
				n1=n1/10;
			}
			if(n2==sum) {
				System.out.println(n2+" is a ArmsStrong Number");
			}
			else {
				System.out.println(n2+" is a Not ArmsStrong Number");
			}
		}
	}


